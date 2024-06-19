package com.sparta.grr;

public abstract class Trainee implements Teachable,Trainable{
    private String name;
    private int age;
    private String email;
    private int phoneNumber;
    private String experience;
    private String certifications;
    private String[] projects;

    @Override
    public void study() {

    }

    @Override
    public void train() {
        Trainable.super.train();
    }
}
