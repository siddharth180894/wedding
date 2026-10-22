package com.matrimonial.wedding.ui.controller;

import com.matrimonial.wedding.ui.Entity.Name;
import com.matrimonial.wedding.ui.InventoryStatus;
import com.matrimonial.wedding.ui.Service.CommonService;
import com.matrimonial.wedding.ui.Service.UserService;
import com.matrimonial.wedding.ui.dto.RegisterUserRequest;
import com.matrimonial.wedding.ui.model.response.UserRest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@Slf4j
@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @Autowired
    private CommonService commonService;

    @Autowired
    private InventoryStatus inventoryStatus;

    @Autowired
    private UserService userService;

//    @GetMapping(path = "/{userId}")
//    public String gerUser(@PathVariable String userId){
//        return "get user was called with userId ="+ userId;
//    }

    @GetMapping(path = "/{userId}")
    public UserRest gerUser(@PathVariable String userId){

        UserRest returnValue= new UserRest();

        returnValue.setEmail("sid@gmail.com");
        returnValue.setFirstName("siddharth");
        returnValue.setLastName("sundriyal");

        return returnValue;
    }

//    @PostMapping
//    public String createUser(){
//        return "create user was called";
//    }

//    @PostMapping("/add")
//    public Name addUser(@RequestBody Name name) {
//        return commonService.addUser(name);
//    }

//    @PostMapping("/add")
//    public ResponseEntity<Map> addEmployee(@RequestBody Name name) {
//        Map map = new HashMap<>();
//        HttpStatus status = null;
//        String val = name.getName();
//        System.out.println("----->>" + val);
//
//        try {
//            Name theName = commonService.addUser(name);
//
//            log.info("data---->>" + theName);
//
//            if (theName == null) map = inventoryStatus.get409();
//            else map = inventoryStatus.get201forClass(theName);
//
//        } catch (Exception e) {
//
//            map = inventoryStatus.get500();
//
//            log.info("error---->" + e.getMessage());
//
//        }
//
//        status = (HttpStatus) map.get("status");
//        return new ResponseEntity<>(map, status);
//
//    }


//    @PostMapping("/add")
//    public ResponseEntity<Map<String, Object>> addEmployee(
//            @RequestBody Name name) {
//
//        try {
//            log.info("Adding employee: {}", name.getName());
//
//            Name theName = commonService.addUser(name);
//
//            Map<String, Object> response;
//
//            if (theName == null) {
//                response = inventoryStatus.get409();
//            } else {
//                response = inventoryStatus.get201forClass(theName);
//            }
//
//            HttpStatus status = (HttpStatus) response.get("status");
//
//            return ResponseEntity.status(status).body(response);
//
//        } catch (Exception e) {
//            log.error("Error while adding employee", e);
//
//            Map<String, Object> response = inventoryStatus.get500();
//
//            HttpStatus status = (HttpStatus) response.get("status");
//
//            return ResponseEntity.status(status).body(response);
//        }
//    }


    @PostMapping("/register")
    public ResponseEntity<Map<String, Object>> registerUser(
            @Valid @RequestBody RegisterUserRequest request) {

        try {
            log.info("Registering user: {}", request.getEmail());

            Long userId = userService.registerUser(request);



            Map<String, Object> response = new HashMap<>();
            response.put("status", HttpStatus.CREATED);
            response.put("message", "User registered successfully");
            response.put("userId", userId);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(response);

        } catch (IllegalArgumentException e) {
            log.warn("Registration failed: {}", e.getMessage());

            Map<String, Object> response = new HashMap<>();
            response.put("status", HttpStatus.CONFLICT);
            response.put("message", e.getMessage());

            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(response);

        } catch (Exception e) {
            log.error("Error while registering user", e);

            Map<String, Object> response = new HashMap<>();
            response.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
            response.put("message", "An unexpected error occurred");

            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(response);
        }
    }


    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
