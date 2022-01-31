package arrays;

import java.util.Scanner;

public class JaggedArrayDemo {
    public static void main(String[] args) {

        int array[][] = new int[3][];
        array[0] = new int[4];
        array[1] = new int[3];
        array[2] = new int[2];

        //initializing array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");

        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
