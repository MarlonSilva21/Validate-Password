package com.example.validatepassword.domain.rules;

import com.example.validatepassword.domain.interfaces.PasswordRulesInterface;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class HasLeastOneSpecialCharacter implements PasswordRulesInterface {
    private final String VALID_SPECIAL_CHARACTERS_REGEX = "!|@|#|$|%|^|&|*|(|)|\\-|+";

    @Override
    public boolean verify(String password) {

        final String hasAtLeastOneSpecialCharacterRegex = "^(?=.*[" + VALID_SPECIAL_CHARACTERS_REGEX + "]).*$";

        if (haveInvalidSpecialCharacters(password)) {
            return false;
        }
        return password.matches(hasAtLeastOneSpecialCharacterRegex);
    }

    private boolean haveInvalidSpecialCharacters(String password) {
        final String specialCharactersBlacklistRegex = "(?=[\\p{P}\\p{S}])(?![" + VALID_SPECIAL_CHARACTERS_REGEX +
                "])[\\w\\p{P}\\p{S}]";

        Pattern pattern = Pattern.compile(specialCharactersBlacklistRegex);
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }
}
