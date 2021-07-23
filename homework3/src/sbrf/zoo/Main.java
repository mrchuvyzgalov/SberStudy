package sbrf.zoo;

import sbrf.zoo.animal.*;
import sbrf.zoo.exception.BadFoodForCatException;
import sbrf.zoo.exception.BadFoodForDogException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(getCountOfAviaries());

        int res = -1;
        do {
            try {
                res = menu();
                if (res == 0) {
                    Scanner scanner = new Scanner(System.in);
                    int maxCount = 0;
                    while (maxCount <= 0) {
                        System.out.print("Введите число мест в вольере: ");
                        maxCount = scanner.nextInt();

                        if (maxCount <= 0) {
                            System.out.println("Неверный ввод");
                        }
                    }
                    zoo.setAviary(new Aviary(maxCount), selectAviary(zoo.getLength()));
                } else if (res == 1) {
                    int index = selectAviary(zoo.getLength());
                    Cat newCat = addCat();
                    zoo.getAviary(index).add(newCat);
                } else if (res == 2) {
                    int index = selectAviary(zoo.getLength());
                    Dog newDog = addDog();
                    zoo.getAviary(index).add(newDog);
                } else if (res == 3) {
                    int aviary = selectAviary(zoo.getLength());
                    System.out.println(zoo.getAviary(aviary));
                } else if (res == 4) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).get(index).eat();
                } else if (res == 5) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).get(index).eat(selectFood());
                } else if (res == 6) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).get(index).walk();
                } else if (res == 7) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).get(index).rejoice();
                } else if (res == 8) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).get(index).jump();
                } else if (res == 9) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Введите слово: ");
                    String word = scanner.nextLine();
                    zoo.getAviary(aviary).get(index).sayWord(word);
                } else if (res == 10) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).get(index).say();
                } else if (res == 11) {
                    int aviary = selectAviary(zoo.getLength());
                    int index = selectAnimal(zoo.getAviary(aviary).getSize());
                    zoo.getAviary(aviary).delete(index);
                }
            } catch(BadFoodForCatException exception) {
                System.out.println(exception.getMessage());
            } catch(BadFoodForDogException exception) {
                System.out.println(exception.getMessage());
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        } while (res != 12);
    }

    public static int getCountOfAviaries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число вольеров в зоопарке: ");
        int res = scanner.nextInt();
        while (res < 1) {
            System.out.println("Неверный ввод");
            System.out.print("Введите число вольеров в зоопарке: ");
            res = scanner.nextInt();
        }
        return res;
    }

    public static int selectAnimal(int count) {
        if (count == 0) {
            throw new IllegalArgumentException("Количество животных в вольере равно нулю");
        }
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (res < 1 || res > count) {
            System.out.print("Введите номер животного от 1 до " + count + ": ");
            res = scanner.nextInt();

            if (res < 1 || res > count) {
                System.out.println("Неверный ввод");
            }
        }
        return res - 1;
    }

    public static  int selectAviary(int count) throws IllegalArgumentException {
        if (count == 0) {
            throw new IllegalArgumentException("Количество вольеров равно нулю");
        }
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (res < 1 || res > count) {
            System.out.print("Введите номер вольера от 1 до " + count + ": ");
            res = scanner.nextInt();

            if (res < 1 || res > count) {
                System.out.println("Неверный ввод");
            }
        }
        return res - 1;
    }

    public static Food selectFood() {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (res < 1 || res > 4) {
            System.out.println("Введите номер еды:");
            System.out.println("1 - Кость");
            System.out.println("2 - Корм");
            System.out.println("3 - Мышка");
            System.out.println("4 - Рыба");
            System.out.print("Ваше решение: ");
            res = scanner.nextInt();

            if (res < 1 || res > 4) {
                System.out.println("Неверный ввод");
            }
        }

        if (res == 1) {
            return Food.Bone;
        } else if (res == 2) {
            return Food.Feed;
        } else if (res == 3) {
            return Food.Mouse;
        } else {
            return Food.Fish;
        }
    }

    public static Cat addCat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя кошки: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст кошки: ");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.print("Неверный ввод. Введите возраст кошки: ");
            age = scanner.nextInt();
        }
        return new Cat(name, age);
    }

    public static Dog addDog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя собаки: ");
        String name = scanner.nextLine();
        System.out.print("Введите возраст собаки: ");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.print("Неверный ввод. Введите возраст собаки: ");
            age = scanner.nextInt();
        }
        return new Dog(name, age);
    }

    public static int menu() {
        Scanner scanner = new Scanner(System.in);

        int res = -1;
        while (res < 0 || res > 12) {
            System.out.println("Меню:");
            System.out.println("0 - Добавить вольер");
            System.out.println("1 - Добавить кошку");
            System.out.println("2 - Добавить собаку");
            System.out.println("3 - Вывести список животных");
            System.out.println("4 - Накормить животное");
            System.out.println("5 - Накормить животное вкусняшкой");
            System.out.println("6 - Погулять с животным");
            System.out.println("7 - Порадовать животное");
            System.out.println("8 - Заставить животное прыгать");
            System.out.println("9 - Заставить животное говорить слово");
            System.out.println("10 - Заставить животное говорить");
            System.out.println("11 - Удалить животное");
            System.out.println("12 - Выход");
            System.out.print("Ваш выбор: ");
            res = scanner.nextInt();

            if (res < 0 || res > 12) {
                System.out.println("Неверный ввод");
            }
        }

        return res;
    }
}
