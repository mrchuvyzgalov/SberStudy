package sbrf.zoo.animal;

import sbrf.zoo.exception.BadFoodForCatException;
import sbrf.zoo.exception.BadFoodForDogException;

public abstract class Animal implements Moveable {
    private String name;
    private int age;

    public Animal() {
        name = "";
        age = 0;
    }

    public Animal(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age должно быть неотрицательным");
        }
        this.name = name;
        this.age = age;
    }

    public abstract void say();
    public abstract void sayWord(String word);
    public abstract void eat();
    public abstract void eat(Food food) throws BadFoodForCatException, BadFoodForDogException;
    public abstract void rejoice();

    @Override
    public String toString() {
        return "Animal{ name= " + name + ", age = " + age + "}";
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

    @Override
    public void jump() {
        System.out.println("Прыг-прыг");
    }

    @Override
    public void walk() {
        System.out.println("Топ-топ");
    }
}
