package com.jsonconverter;

import java.util.List;

public class Employee {



    private String Id;
    private String fullName;
    private String age;
    private List<String> contacts;

    public Employee() {
    }

    public Employee(String Id, String fullName, String age, List<String> contacts) {
        this.Id = Id;
        this.fullName = fullName;
        this.age = age;
        this.contacts = contacts;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        Id = Id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", contacts=" + contacts +
                ", Id=" + Id +
                '}';
    }
}
