package com.company;

public class Manager extends Employee {

    private int numberOfEmployees;

    public Manager(String fn, String ln, long id, int noe) {
        super(fn, ln, id);
        this.numberOfEmployees = noe;
    }

    public Manager() {

    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
