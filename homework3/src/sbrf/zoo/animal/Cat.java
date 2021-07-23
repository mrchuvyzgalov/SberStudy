package sbrf.zoo.animal;

import sbrf.zoo.exception.BadFoodForCatException;
import sbrf.zoo.exception.BadFoodForDogException;

public class Cat extends Animal{
    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }

    @Override
    public void sayWord(String word) {
        System.out.println("Мяу, " + word);
    }

    @Override
    public void eat() {
        System.out.println("Мяу, мяу. Как вкусно!!!");
    }

    @Override
    public void eat(Food food) throws BadFoodForCatException, BadFoodForDogException {
        if (food == null || food == Food.Bone) {
            throw  new BadFoodForCatException("Кошки не едят кости");
        }
        System.out.println("Мяу, мяу. Вкусная еда!!!");
    }

    @Override
    public void rejoice() {
        System.out.println("Мурррррррр");
    }

    @Override
    public String toString() {
        return "Cat{ name= " + getName() + ", age = " + getAge() + "}";
    }
}
