package sbrf.task2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\SberStudy\\homework10\\src\\sbrf\\task2\\test\\1.txt");
        if (file.exists()) {
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());
            File dir = new File(file.getParent());
            for (File fileTmp : dir.listFiles()) {
                System.out.println(fileTmp.getName());
            }

        }
        else {
            System.out.println("Файла не существует");
        }
    }
}
