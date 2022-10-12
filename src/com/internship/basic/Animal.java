package com.internship.basic;

public class Animal {
    private String kind;
    private int age;
    private Boolean isTrained;

    public Animal(String kind, int age, Boolean isTrained) {
        this.kind = kind;
        this.age = age;
        this.isTrained = isTrained;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(Boolean isTrained) {
        this.isTrained = isTrained;
    }

    public void animalInfo() {
        String infoMessage = "This is a " + getKind() + ". \n" +
                "It's " + getAge() + " years old.\n" +
                (Boolean.TRUE.equals(isTrained) ? "Relax, it is trained." : "Be careful, it is not trained.");

        System.out.println(infoMessage);
    }
}
