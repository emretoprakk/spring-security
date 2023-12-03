package com.emretoprak.ecommerce.service.user;

import com.emretoprak.ecommerce.dto.SignupDTO;
import com.emretoprak.ecommerce.dto.UserDTO;

public interface UserService {
    UserDTO createUser(SignupDTO signupDTO);

    boolean hasUserWithEmail(String email);

}
