package controlflowstatement;

/**
 * Break - it immediately terminates the block/loop and the control resumes at the next stmt.
 */
public class BreakStatement {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==3)
                break;
            System.out.println("i="+i);
        }

        for (int i=1;i<=5;i++){     // i = 1,2,3
            for (int j=1;j<=5;j++){  //j = 1,2,3,4,5,6 | 1,
                if (i==2 && j==2){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
