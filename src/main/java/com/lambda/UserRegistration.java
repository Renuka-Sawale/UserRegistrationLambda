package com.lambda;

import java.util.regex.Pattern;

public class UserRegistration {

    @FunctionalInterface
    public interface UserRegistrationUsingLambda {
        boolean test(String pattern, String input);
    }

    UserRegistrationUsingLambda inputTest = (pattern,input) -> Pattern.compile(pattern).matcher(input).matches();

    private static final String First_Name_Check="(^[A-Z]{1}[a-z]{2,}$)";
    private static final String Last_Name_Check=("^[A-Z]{1}[a-z]{2,}");
    private static final String Email_Check=("^[a-zA-Z[0-9]+.-]*+[a-zA-Z0-9+]*@[a-zA-Z0-9+.,]*+$");
    private static final String PhoneNo_Check=("^[0-9]{1,2} [0-9]{10}");
    private static final String Password_Check=("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");

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

    public boolean lastNameTest(String lastName) throws UserRegistrationException {
        boolean test= Pattern.compile(Last_Name_Check).matcher(lastName).matches();
        if (test){
            System.out.println(lastName + " Is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("Given input is not valid");
        }
    }

    public boolean emailTest(String email) throws UserRegistrationException {
        boolean test= Pattern.compile(Email_Check).matcher(email).matches();
        if (test){
            System.out.println(email + " Is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("Given input is not valid");
        }
    }

    public boolean phoneNoTest(String phoneNo) throws UserRegistrationException {
        boolean test= Pattern.compile(PhoneNo_Check).matcher(phoneNo).matches();
        if (test){
            System.out.println(phoneNo + " Is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("Given input is not valid");
        }
    }

    public boolean passwordTest(String password) throws UserRegistrationException {
        boolean test= Pattern.compile(Password_Check).matcher(password).matches();
        if (test){
            System.out.println(password + " Is valid");
            return true;
        }
        else {
            throw new UserRegistrationException("Given input is not valid");
        }
    }
}
