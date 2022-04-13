package academy.devdojo.maratonajava.javacore.OException.test.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }

    private static void createNewFile(){
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
