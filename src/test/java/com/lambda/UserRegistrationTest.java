package com.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstNameWhenProperShouldReturnResult() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        boolean result = userregistration.firstNameTest("Renuka");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenNotProperShouldThrowException() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        try {
            boolean result = userregistration.firstNameTest("re");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}