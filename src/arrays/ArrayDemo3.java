package arrays;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //declaring array
        int[][] a1;
        int [][]a2;
        int a3[][];
        int []a4[];

        //instanting an array
        a1 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int a5[][]= {{1,2,3},{5,6,9},{8,6,3}};
        System.out.println("Enter values");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                a1[i][j] = sc.nextInt();
            }
        }

        //printing array

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}

