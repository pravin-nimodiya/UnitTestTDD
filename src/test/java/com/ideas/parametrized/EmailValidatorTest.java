package com.ideas.parametrized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void testIsValid() {
        assertFalse(EmailValidator.isValid(null));
        assertFalse(EmailValidator.isValid(""));
        assertFalse(EmailValidator.isValid("plainaddress"));
        assertFalse(EmailValidator.isValid("@missingusername.com"));
        assertFalse(EmailValidator.isValid("username@.com"));
        assertFalse(EmailValidator.isValid("username@com"));
        assertTrue(EmailValidator.isValid("username@domain.com"));
        assertFalse(EmailValidator.isValid("username@domain..com"));
    }

}