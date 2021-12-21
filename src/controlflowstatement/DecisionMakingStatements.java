package controlflowstatement;

/**
 * There are 4 types of if statements
 * 1. Simple if
 * 2. if-else stmt
 * 3. if-else-if ladder
 * 4. Nested if
 *
 * *** Switch Statement -
 * switch(expr) //int,short,byte,char,String - java 7{
 * case 1: // cases can not be duplicate
 * stmts;
 * break;// terminates switch block
 * case 2:
 * stmts;
 * break;
 * .
 * .
 * .
 * .case 10;
 * default: // optional
 * stmts
 * }
 */
public class DecisionMakingStatements {
    public static void main(String[] args) {
        //Simple if
        int a = 15;
        int b= 25;
        if(b > a) {
            System.out.println("b is greater");
        }
        //if-else stmt
        if (a>b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");

        //if-else-if ladder
        String name = "abc";
        if (name == "xyz"){
            System.out.println("Name is xyz");
        }else {
            if (name == "pqr") {
                System.out.println("Name is pqr");
            } else if (name == "mnr") {
                System.out.println("Name is mnr");
            } else
                System.out.println(name);
        }
        //Nested if
        String address = "Pune";
        if (address == "Pune"){
            if (name == "xyz"){
                System.out.println("address is Pune & name is abc");
            }else {
                if (name == "abc"){
                    System.out.println("address is Pune & name is abc");
                }
            }
        }else {
            System.out.println("You are living in Mumbai");
        }

        //switch
        int cnt = 5;
        switch(cnt){
            case 1:
                System.out.println("Counter is 1");
                break;
            case 2:
                System.out.println("Counter is 2");
                break;
            case 3:
                System.out.println("Counter is 3");
                break;
            default:
                System.out.println("Default "+cnt);
        }
    }
}
