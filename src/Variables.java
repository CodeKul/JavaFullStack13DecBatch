/**
 * Types of Variables
 *  1. local variable --> variables declared inside method body
 *  2. instance variable --> variables declared inside class but outside the method body
 *  3. static variable --> cannot be local,share among all the instance of class, memory allocation
 *                          happens only once when the class loaded in memory
 *
 */

public class Variables {
    int age=25;//instance variable
    static int staticVariable = 50; //static variables

    void show(){
        int b = 20; //local variables
    }

    public static void main(String[] args) {
        int a = 15; //local variables

    }

}
