package filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
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
            System.out.println("canExecute: "+file.canExecute()); //need to check
            System.out.println("canRead: "+file.canRead());
            System.out.println("canWrite: "+file.canWrite());
            System.out.println("file.exists(): "+ file.exists());
            System.out.println(file.getCanonicalFile());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getFreeSpace()); //need to check
            System.out.println(file.getName());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.getParent());
            System.out.println(file.getPath());
        }
       // System.out.println(isFileCreated ? "File is Created" : "Error Occurred while creating file");
    }
}
