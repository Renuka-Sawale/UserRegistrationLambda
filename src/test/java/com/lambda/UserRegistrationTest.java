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

    @Test
    public void givenEmailWhenProperShouldReturnResult() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        boolean result = userregistration.emailTest("rrsuryawanshi11@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailWhenNotProperShouldThrowException() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        try {
            boolean result = userregistration.emailTest("r@gmail.com");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNoWhenProperShouldReturnResult() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        boolean result = userregistration.phoneNoTest("91 8232345678");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNoWhenNotProperShouldThrowException() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        try {
            boolean result = userregistration.phoneNoTest("913456789045");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPasswordWhenProperShouldReturnResult() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        boolean result = userregistration.passwordTest("Bridgelabz@1234");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordWhenNotProperShouldThrowException() throws UserRegistrationException {
        UserRegistration userregistration = new UserRegistration();
        try {
            boolean result = userregistration.passwordTest("bridgelabz");
            Assertions.assertFalse(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}