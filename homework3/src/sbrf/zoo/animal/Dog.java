package sbrf.zoo.animal;

import sbrf.zoo.exception.BadFoodForCatException;
import sbrf.zoo.exception.BadFoodForDogException;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Гав-гав");
    }

    @Override
    public void sayWord(String word) {
        System.out.println("Гав-гав, " + word);
    }

    @Override
    public void eat() {
        System.out.println("Гав-гав, как вкусно!!!");
    }

    @Override
    public void eat(Food food) throws BadFoodForCatException, BadFoodForDogException {
        if (food == null || food == Food.Mouse) {
            throw new BadFoodForDogException("Собаки не едят мышей");
        }
        System.out.println("Гав-гав, как вкусно!!!");
    }

    @Override
    public void rejoice() {
        System.out.println("Гав-гав-гав!!!");
    }

    @Override
    public String toString() {
        return "Dog{ name= " + getName() + ", age = " + getAge() + "}";
    }
}
