package com.lambda;

import java.util.regex.Pattern;

public class UserRegistration {

    @FunctionalInterface
    public interface UserRegistrationUsingLambda {
        boolean test(String pattern, String input);
    }

    UserRegistrationUsingLambda inputTest = (pattern,input) -> Pattern.compile(pattern).matcher(input).matches();

    private static final String First_Name_Check="(^[A-Z]{1}[a-z]{2,}$)";

    public boolean firstNameTest(String firstName) throws UserRegistrationException {
        boolean test= Pattern.compile(First_Name_Check).matcher(firstName).matches();
        if (test){
            System.out.println(firstName + " Is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("Given input is not valid");
        }
    }
}
