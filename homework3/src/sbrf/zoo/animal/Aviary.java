package sbrf.zoo.animal;

import java.util.Arrays;

public class Aviary {
    private Animal[] animals;
    private int size;

    public int getSize() {
        return size;
    }

    public Aviary(int maxCount) throws IllegalArgumentException {
        if (maxCount < 1) {
            throw new IllegalArgumentException("Хотя бы одно место в вольере должно быть");
        }
        animals = new Animal[maxCount];
        size = 0;
    }

    public Animal get(int index) throws IndexOutOfBoundsException {
        if (size == 0) {
            throw new IndexOutOfBoundsException("В вольере пусто");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Некорректный индекс. Он должен быть от 0 до " + (size - 1));
        }

        return animals[index];
    }

    public void add(Animal animal) throws IndexOutOfBoundsException, IllegalArgumentException {
        if (size == animals.length) {
            throw new IndexOutOfBoundsException("В вольере больше нет мест");
        }
        if (animal == null) {
            throw new IllegalArgumentException("Животное не задано");
        }
        if (IsInAviary(animal)) {
            throw new IllegalArgumentException("Животное уже в вольере");
        }
        animals[size++] = animal;
    }

    public void delete(int index) throws IndexOutOfBoundsException {
        if (size == 0) {
            throw new IndexOutOfBoundsException("В вольере нет животных");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс должен быть от 0 до " + (size - 1));
        }
        for (int i = index + 1; i < size; ++i) {
            animals[i - 1] = animals[i];
        }
        animals[--size] = null;
    }

    @Override
    public String toString() {
        return Arrays.toString(animals);
    }

    private boolean IsInAviary(Animal animal) {
        for (int i = 0; i < size; ++i) {
            if (animals[i] == animal) {
                return true;
            }
        }
        return false;
    }
}
