package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

@Component
public class HasAtLeastNineCharacters implements PasswordRulesInterface {

    @Override
    public boolean verify(String password) {
        final String atLeastOneDigitRegex = "^(?=^.{9,}).*$";

        return password.matches(atLeastOneDigitRegex);
    }
}
