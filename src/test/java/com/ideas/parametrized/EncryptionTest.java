package com.ideas.parametrized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    @Test
    void testEncryptionWithTrue() {
        assertEquals("hello", Encryption.encrypt("hello", true));
    }

    @Test
    void
    testEncryptionWithFalse() {
        assertEquals("aGVsbG8=", Encryption.encrypt("hello", false));
    }

}