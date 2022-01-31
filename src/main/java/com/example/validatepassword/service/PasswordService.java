package com.example.validatepassword.service;

import com.example.validatepassword.domain.entity.Password;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    public boolean verifyPassword(Password password) {

        final String rulesForValidation = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{9,}$";
        final String haveNonRepeatingCharacters = "^(?!.*(.).*\\1).*$";
        String pass = password.getPassword();

        if (pass.matches(rulesForValidation)) {
            return pass.matches(haveNonRepeatingCharacters);
        }
        return false;
    }
}
