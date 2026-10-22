package com.matrimonial.wedding.ui.Service;

import com.matrimonial.wedding.ui.Entity.User;
import com.matrimonial.wedding.ui.Repository.UserRepository;
import com.matrimonial.wedding.ui.dto.RegisterUserRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

        private final UserRepository userRepository;
        private final PasswordEncoder passwordEncoder;

        public UserServiceImpl(
                UserRepository userRepository,
                PasswordEncoder passwordEncoder) {
            this.userRepository = userRepository;
            this.passwordEncoder = passwordEncoder;
        }

        @Override
        @Transactional
        public Long registerUser(RegisterUserRequest request) {

            String email = request.getEmail().trim().toLowerCase();

            if (userRepository.existsByEmail(email)) {
                throw new IllegalArgumentException(
                        "Email is already registered");
            }

            String phone = request.getPhoneNumber();

            if (phone != null && !phone.isBlank()) {
                phone = phone.trim();

                if (userRepository.existsByPhoneNumber(phone)) {
                    throw new IllegalArgumentException(
                            "Phone number is already registered");
                }
            } else {
                phone = null;
            }

            User user = new User();

            user.setEmail(email);
            user.setPasswordHash(
                    passwordEncoder.encode(request.getPassword()));
            user.setPhoneNumber(phone);

            // These values are controlled by the backend.
            user.setAccountStatus("ACTIVE");
            user.setEmailVerified(false);

            User savedUser = userRepository.save(user);

            return savedUser.getUserId();
        }
    }


