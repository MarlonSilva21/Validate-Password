package com.example.validatepassword.controller;

import com.example.validatepassword.entity.Password;
import com.example.validatepassword.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    @PostMapping
    public ResponseEntity<Boolean> validatePassword(@RequestBody Password password) {
        return ResponseEntity.status(HttpStatus.OK).body(passwordService.verifyPassword(password));
    }
}
