package filehandling;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("codekul.txt");
        if (file.createNewFile()){
            System.out.println("File with name "+file.getName() + " is created");//Returns the name of the file
        }
        else {
            System.out.println("File already exists");
        }

        if (file.exists()){
            System.out.println("Name of the file "+file);
            System.out.println("Absolute Path: "+file.getAbsoluteFile());
        }
       // System.out.println(isFileCreated ? "File is Created" : "Error Occurred while creating file");
    }
}
