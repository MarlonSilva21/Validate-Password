package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

@Component
public class HaveNonSpaces implements PasswordRulesInterface {

    @Override
    public boolean verify(String password) {
        final String haveNonSpacesRegex = "^(?!.*\\h).*$";

        return password.matches(haveNonSpacesRegex);
    }
}
