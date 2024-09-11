package org.example.Factory.Example1;

public class Developer implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Developer Salary");
        return 50000;
    }
}
