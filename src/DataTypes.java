/**
 * There are 2 types in Java
 * 1. Primitive - includes boolean,char,byte,short,int,long,float and double
 * 2. Non - Primitive - Classes,Interface,Arrays,String
 *
 * Data Type specify diff sizes & values that can be stored in the variables
 *  --Statically typed programming -->> variables must be declared before its use.
 */
public class DataTypes {

    public static void main(String[] args) {
        //Primitive Data Types
        boolean flag = false; //false or true //default value false  //size 1 bit

        byte  a = 10; // default value 0 // range -128 to 127 // size 1 byte

        short s = 1000; //default value 0 // range -32,768 to 32767 // size 2 byte

        int n = 1000000; //default value 0 // range -2^31-1 to 2^31 // size 4 byte

        long l = 1000000L; //default value 0  // range -2^63 to 2^63 //size 8 byte


        float f = 95.64f; // default value 0.0f //unlimited  //size 4 byte

        double d = 155.55d; // default value 0.0d //unlimited  //size 8 byte

        char c = 'a'; //a single 16-bit unicode character

        String name = "Codekul"; // default value null // unlimited
    }

}
