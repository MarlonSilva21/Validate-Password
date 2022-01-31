package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

@Component
public class HasAtLeastUppercaseLetter implements PasswordRulesInterface {

    @Override
    public boolean verify(String password) {

        final String atLeastUppercaseCharacterRegex = "(?=.*[A-Z]).*$";

        return password.matches(atLeastUppercaseCharacterRegex);
    }
}
