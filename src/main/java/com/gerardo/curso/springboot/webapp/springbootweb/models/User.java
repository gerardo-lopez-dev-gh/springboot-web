package com.gerardo.curso.springboot.webapp.springbootweb.models;

public class User {
    private String name;
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
}
