package mypack.pack1;

import mypack.pack2.*;
import mypack.pack2.pack3.P4;

//import mypack.pack2.P1;
//import mypack.pack2.P2;

public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome!!!");
        P1 p1 = new P1();
        p1.getMsg();

        P2 p2 = new P2();

        P3 p3 = new P3();

        P4 p4 = new P4();

        mypack.pack2.pack4.P4 p14 = new mypack.pack2.pack4.P4();
    }
}
