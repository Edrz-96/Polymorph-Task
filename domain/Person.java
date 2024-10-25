package uk.co.devfoundry.tasks.polytask.domain;

import java.sql.Date;
import java.time.LocalDateTime;

public class Person implements PersonDetails {


    private String name;
    private int yearOfBirth;
    private String address;
    public int count;

    public Person(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        count++;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public int calculateAge() {
        return LocalDateTime.now().getYear() - yearOfBirth;
    }


    @Override
    public String toString() {
        return String.format("%s: name: %s, year born: %d, address: %s, age: %d", this.getClass().getSimpleName(), name, yearOfBirth, address, calculateAge());

    }


}
