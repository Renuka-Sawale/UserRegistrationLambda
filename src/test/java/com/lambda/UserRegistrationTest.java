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
            boolean result = userregistration.firstNameTest("ren");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastNameWhenProperShouldReturnResult() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        boolean result = userregistration.lastNameTest("Sawale");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenNotProperShouldThrowException() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        try {
            boolean result = userregistration.lastNameTest("saw");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}