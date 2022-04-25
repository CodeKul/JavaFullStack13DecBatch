package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("/api/codekul452.txt");
        Boolean isFileCreated = false;
        try {
            isFileCreated = file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
       // System.out.println(isFileCreated ? "File is Created" : "Error Occurred while creating file");
    }
}
