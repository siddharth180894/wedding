package com.matrimonial.wedding.ui.Service;

import com.matrimonial.wedding.ui.Entity.Name;
import com.matrimonial.wedding.ui.Repository.CommanRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CommonServiceImpl implements CommonService{

    @Autowired
    private CommanRepo commanRepo;

    @Override
    public Name addUser(Name name) {
        log.info("Saving category: {}", name.getName());

        return commanRepo.save(name);

    }
    }

