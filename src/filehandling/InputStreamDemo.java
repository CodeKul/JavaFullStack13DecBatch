package filehandling;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("");
            OutputStream outputStream = new FileOutputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
