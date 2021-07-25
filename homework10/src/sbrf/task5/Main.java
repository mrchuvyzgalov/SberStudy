package sbrf.task5;

import java.io.*;

public class Main {
    public static void copy(File input, File output) throws IOException {
        try(FileReader fr = new FileReader(input); FileWriter fw = new FileWriter(output)) {
            while (fr.ready()) {
                fw.write(fr.read());
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        File output = new File("output.txt");
        copy(input, output);
    }
}
