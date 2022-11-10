package com.atguigu.boot.bean;

/**
 * @author Oliver
 * @create 2022-11-04 20:19
 */
public class User {

    private String name;
    private Integer age;

    private Pet pet;


    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public User() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
