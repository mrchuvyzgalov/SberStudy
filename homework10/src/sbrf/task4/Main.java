package sbrf.task4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File loveFile = new File("love.txt");
        loveFile.createNewFile();
        try(FileWriter fw = new FileWriter(loveFile)) {
            fw.write("Я люблю Java");
        }
    }
}
