package filehandling;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.delete())
            System.out.println("File deleted successfully");
        else
            System.out.println("File with given name doesnot exists");
    }
}
