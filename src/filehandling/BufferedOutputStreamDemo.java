package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        String filePath = "/home/madhuri/workspace/2021/JavaFullStack13DecBatch/src/filehandling/sample1.txt";

        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            String content = "Today is 7th May 22";
            byte[] arr = content.getBytes();
            fos.write(arr);
            fos.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fin = new FileInputStream(filePath);
            int i = fin.read();
            while (i>0){
                System.out.println((char)i);
                i = fin.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
