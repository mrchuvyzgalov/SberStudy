package sbrf.task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int maxCountOfLines = 5;
    public static List<String> read(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        if (file.exists()) {
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                while (br.ready()) {
                    lines.add(br.readLine());
                }
            }
        }
        return lines;
    }
    public static void print(File file) throws IOException {
        List<String> lines = read(file);
        if (lines.size() <= maxCountOfLines) {
            for (String line : lines) {
                System.out.println(line);
            }
        }
        else {
            for (int i = lines.size() - maxCountOfLines; i < lines.size(); ++i) {
                System.out.println(lines.get(i));
            }
        }
    }
    public static void save(File file, String str) throws IOException {
        List<String> lines = read(file);
        lines.add(str);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File save = new File("save.txt");
        print(save);
        Scanner scanner = new Scanner(System.in);
        save(save, scanner.nextLine());
    }
}
