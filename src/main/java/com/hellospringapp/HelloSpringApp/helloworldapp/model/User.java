package com.hellospringapp.HelloSpringApp.helloworldapp.model;

public class User {
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstNmae(String firstNmae){
        this.firstName =firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
