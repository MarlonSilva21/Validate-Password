package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class HaveNonRepeatingCharacters implements PasswordRulesInterface {

    @Override
    public boolean verify(String password) {
        final String haveNonRepeatingCharactersRegex = "^(?!.*(.).*\\1).*$";

        Pattern haveNonRepeatingCharactersPattern = Pattern.compile(haveNonRepeatingCharactersRegex, Pattern.CASE_INSENSITIVE);

        return haveNonRepeatingCharactersPattern.matcher(password).find();
    }
}
