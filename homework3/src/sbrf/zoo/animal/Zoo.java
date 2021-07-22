package sbrf.zoo.animal;

import java.util.Arrays;

public class Zoo {
    private Aviary[] zoo;

    public int getLength() {
        return zoo.length;
    }

    @Override
    public String toString() {
        return "##" + Arrays.toString(zoo) + "##";
    }

    public Zoo(int count) {
        if (count < 1) {
            throw new IllegalArgumentException("В зоопарке должен быть хотя-бы один вольер");
        }
        zoo = new Aviary[count];
    }

    public Aviary getAviary(int index) throws IndexOutOfBoundsException, IllegalArgumentException {
        if (index < 0 || index >= zoo.length) {
            throw new IndexOutOfBoundsException("Индекс должен быть от 0 до " + (zoo.length - 1));
        }
        if (zoo[index] == null) {
            throw new IllegalArgumentException("Вольера не существует");
        }
        return zoo[index];
    }

    public void setAviary(Aviary aviary, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= zoo.length) {
            throw new IndexOutOfBoundsException("Индекс должен быть от 0 до " + (zoo.length - 1));
        }
        zoo[index] = aviary;
    }
}
