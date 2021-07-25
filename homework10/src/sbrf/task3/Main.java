package sbrf.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("test.txt")) {
            file.skip(2);
            System.out.println((char)file.read());
            System.out.println((char)file.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
