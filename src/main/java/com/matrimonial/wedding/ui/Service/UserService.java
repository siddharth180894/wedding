package com.matrimonial.wedding.ui.Service;

import com.matrimonial.wedding.ui.dto.RegisterUserRequest;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    @Transactional
    Long registerUser(RegisterUserRequest request);
}
