package operators;

/**
 * Types of Operators in Java
 *  1. Unary Operator -> expr++,expr--,++expr,--expr,~,!
 *  2. Arithmetic Operator -> +,-,*,/,%
 *  3. Shift Operators ->  <<,>>
 *  4. Logical Operators -> Logical AND (&&),Logical OR (||)
 *  5. Bitwise Operators -> Bitwise AND (&),Bitwise OR(|)
 *  6. Ternary Operators -> ? :
 *  7. Assignment Operators -> = ,!=,+=,-=,*=,/=,%=,&=,^=,|=
 */
public class Operators {
    public static void main(String[] args) {
        ///Unary Operators
        int a = 10;
        System.out.println(a); //10
        System.out.println(a++); //10
        System.out.println(++a); //12
        System.out.println(a--);//12 (11)
        System.out.println(--a); //10
        int x = 20;
        System.out.println(x);//20
        System.out.println(x++);//20
        System.out.println(++x);//22
        System.out.println(x--);//22
        System.out.println(--x);//20
        int m = 20;
        int n = 20;
        int p = 10;
        System.out.println(m++ + ++m); // 20 + 22 = 42
        System.out.println(n++ + n++); //20 + 21 = 41
        System.out.println(~p);//(-p)-1=(-10)-1 = -11
        boolean flag = true;
        System.out.println(flag);//true
        System.out.println(!flag);//false
       // Arithmetic Operators
        m = 20;
        n = 20;
        System.out.println(m+n);//40
        System.out.println(m-n);//0
        System.out.println(m*n);//400
        System.out.println(m/n);//1
        System.out.println(m%n);//0

        //Shift Operators
        a= 10;
        System.out.println(a<<2);//10<<2 = 10*2^2 = 10*4 = 40
        System.out.println(a<<3);//10<<3 = 10*2^3 = 10*8 = 80
        System.out.println(a<<4); // 10<<4 = 10*2^4 = 10*16 = 160

        a= 10;
        System.out.println(a>>2); // 10>>2 = 10/2^2 = 10/4 = 2
        System.out.println(20>>2); // 20/4 = 5
        System.out.println(30>>3); // 30/8 = 3

        m = 10;
        n = 5;
        p = 15;
        //Logical AND(&&)
        System.out.println(m<n && m<p ); // false
        //Bitwise AND(&)
        System.out.println(m<n & m<p); //false & true = false

        System.out.println(m < n && m++ < p); //false
        System.out.println(m<p && n<m);//true

        //Logical OR(||)
        System.out.println(m>n || m<p);//true || true = true
        System.out.println(m<n || n<p); // false || true = true

        //Bitwise OR(|)
        System.out.println(a>n | ++p>n);

        //Ternary operator
        System.out.println(m<n?"m is min":"m is max");
        int min = n<p ? n : p;
        System.out.println(min);//n = 5
        if (m<n)
            System.out.println("m is min");
        else
            System.out.println("m is max");

        //Assignment operators
        m = 10;
        n = 15;

        m+=5; // m = m+5 = 15
        n-=5; // n = n-5 = 10
        m*=2; //m = m*2 = 20
        n/=3; //n =n/3 = 5
    }
}
