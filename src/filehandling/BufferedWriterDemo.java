package filehandling;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        FileWriter  fileWriter = null;
        try {
            fileWriter = new FileWriter("/home/madhuri/workspace/2021/JavaFullStack13DecBatch/src/filehandling/sample.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Today is Thursday");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader("/home/madhuri/workspace/2021/JavaFullStack13DecBatch/src/filehandling/sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();
            while (i>0){
                System.out.print((char)i);
                i = bufferedReader.read();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
