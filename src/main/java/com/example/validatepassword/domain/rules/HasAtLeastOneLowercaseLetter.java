package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

@Component
public class HasAtLeastOneLowercaseLetter implements PasswordRulesInterface {

    @Override
    public boolean verify(String password) {
        final String atLeastOneLowercaseLetterRegex = "^(?=.*[a-z]).*$";

        return password.matches(atLeastOneLowercaseLetterRegex);
    }
}
