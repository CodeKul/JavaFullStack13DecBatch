package arrays;

import java.util.Scanner;

public class Addition3Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        int m3[][] = new int[3][3];
        System.out.println("Enter elements of 1st matrix ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                m2[i][j] = sc.nextInt();
            }
        }

        //Addition of m1 & m2
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Addition of Matrix is: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
     }
}

