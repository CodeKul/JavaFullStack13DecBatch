package controlflowstatement;

/***
 * while loop -
 */
public class Loops {
    public static void main(String[] args) {
        //for loop
        for (int i=1;i<=10;i++){
            System.out.println("Hello "+i);
            break;
        }
        //Nested for loop
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println("i= "+i +" & j= "+j);
            }
        }
        //for-each loop
        int arr[] = {1,2,3,4,5,6};
        for (int a:arr){
            System.out.println(a);
        }
        //Infinite for loop
//        for (;;){
//            System.out.println("Infinite");
//        }

        //While loop
        int cnt = 1;
        while (cnt<=10){
            System.out.println("cnt is "+cnt);
            cnt++;
        }
        //infinite while loop

        int i = 1;
        System.out.println("Table of 2");
        while (i<=10){
            System.out.println(2*i);
            i++;
        }
//        while (true){
//            System.out.println("infinite");
//        }
    }
}
