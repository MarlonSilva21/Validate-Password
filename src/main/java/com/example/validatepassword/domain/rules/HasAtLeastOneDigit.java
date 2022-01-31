package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

@Component
public class HasAtLeastOneDigit implements PasswordRulesInterface {

    @Override
    public boolean verify(String password) {
        final String atLeastOneDigitRegex = "^(?=.*[0-9]).*$";

        return password.matches(atLeastOneDigitRegex);
    }
}
