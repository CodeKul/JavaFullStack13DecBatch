package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("input.txt");
            fileWriter.write("Happy New Year!!!!");
            fileWriter.write("\nWelcome to 2022!!");
            fileWriter.close();
            System.out.println("Content gets added");
        }catch (IOException i){
            System.out.println(i.getMessage());
            i.printStackTrace();
        }
    }
}
