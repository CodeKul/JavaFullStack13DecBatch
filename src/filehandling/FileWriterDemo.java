package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/home/madhuri/workspace/2021/JavaFullStack13DecBatch/src/filehandling/input.txt");
          //  fileWriter.write("Happy New Year!!!!");
          //  fileWriter.write("\nWelcome to 2022!!");
            fileWriter.write("Welcome");
            fileWriter.close();
            System.out.println("Content gets added");
        }catch (IOException i){
            System.out.println(i.getMessage());
            i.printStackTrace();
        }

        {
            try {
                FileReader  fileReader = new FileReader("/home/madhuri/workspace/2021/JavaFullStack13DecBatch/src/filehandling/input.txt");
                int i = fileReader.read();
                System.out.println("i: "+i);
                while (i>0){
                    //System.out.println("i: "+i);
                    System.out.print((char) i);
                    i = fileReader.read();
                }
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
