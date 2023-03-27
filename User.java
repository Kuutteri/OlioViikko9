package com.example.user;

public class User {
    protected String firstName;
    protected String lastName;
    protected  String email;
    protected String degreeProgram;
    protected int image;

    public User(String FirstNameParameter, String LastNameParameter, String emailParameter, String degreeParameter, int imageParameter) {
        firstName  = FirstNameParameter;
        lastName = LastNameParameter;
        email = emailParameter;
        degreeProgram = degreeParameter;
        image = imageParameter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public int getImage() {
        return image;
    }
}
