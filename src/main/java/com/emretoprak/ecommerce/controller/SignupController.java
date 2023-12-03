package com.emretoprak.ecommerce.controller;

import com.emretoprak.ecommerce.dto.SignupDTO;
import com.emretoprak.ecommerce.dto.UserDTO;
import com.emretoprak.ecommerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    @Autowired // bir nesneni otomatik olarak olusmasını saglar
    private UserService userService;
    @PostMapping("/sign-up") //sunucuya veri eklemek
    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO) {
        if(userService.hasUserWithEmail(signupDTO.getEmail())) {
            return new ResponseEntity<>("User already exist",HttpStatus.NOT_ACCEPTABLE);
        }
        UserDTO createdUser = userService.createUser(signupDTO);
        if (createdUser == null) {
            return new ResponseEntity<>("User not created.Come again later!", HttpStatus.BAD_REQUEST);
        } return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
