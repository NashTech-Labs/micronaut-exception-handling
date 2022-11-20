package com.knoldus.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class CustomExceptionTest {

    @Test
    void testConstructor() {
        CustomException actualCustomException = new CustomException();
        assertNull(actualCustomException.getCause());
        assertEquals(0, actualCustomException.getSuppressed().length);
        assertNull(actualCustomException.getMessage());
        assertNull(actualCustomException.getLocalizedMessage());
    }


    @Test
    void testConstructor2() {
        CustomException actualCustomException = new CustomException("An error occurred");
        assertNull(actualCustomException.getCause());
        assertEquals(0, actualCustomException.getSuppressed().length);
        assertEquals("An error occurred", actualCustomException.getMessage());
        assertEquals("An error occurred", actualCustomException.getLocalizedMessage());
    }


}

