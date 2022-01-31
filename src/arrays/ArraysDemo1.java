package arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //declaration of array
        int[] a1;
        int []a2;
        int a3[];

        //instantiate an array & allocating memory
        a1 = new int[5];
        a2 = new int[5];
        a3 = new int[5];

        //initialize an array
        a1[0] = 5;
        a1[1] = 10;
        a1[2] = 15;
        a1[3] = 20;
        a1[4] = 25;

        //print/traverse array
        for (int i=0;i<a1.length;i++){ // i<5 or i<=4 or i<a1.length
            System.out.println(a1[i]);
        }

        // throw ArrayIndexOutOfBoundsException
        //System.out.println(a1[5]);


    }
}
