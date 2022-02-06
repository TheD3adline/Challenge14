package com.company;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
