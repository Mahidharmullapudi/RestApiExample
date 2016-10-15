package com.restapi;

public class User {

    public User() {

    }

    private String id;
    private String name;
    private int age;
    private String profession;
    private String process_status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProcess_status() {
        return process_status;
    }

    public void setProcess_status(String process_status) {
        this.process_status = process_status;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name+ " age: " +this.age+ " profession: " +this.profession+ " process_status: " +this.process_status;

    }

}
