package org.example;


public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }

    public void play() {
        System.out.println(name + " играет с мячиком.");
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " год(а)");
    }
}
