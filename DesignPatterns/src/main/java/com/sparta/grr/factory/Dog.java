package com.sparta.grr.factory;

public class Dog implements Speakable{
    private String breed;

    public Dog(){
        breed = "Mutt";
    }

    public Dog(String breed){
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String speak() {
        return breed + " Says Woof";
    }
}
