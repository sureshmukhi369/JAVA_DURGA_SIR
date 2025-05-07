package bytes;

/*
*  -> byte:- size 1 byte(8 bits) memory.
*   -> MAX_VALUE :- +127
*   -> MIN_VALUE :- -128
*   -> Range -129 to +127
*    0 means +ve, 1 means -ve
*      Positive number will be represented in directly in a memory, whereas negative number is represented in two's compliment form.
*
*    byte is the best choice, if you want to handle data in terms of Streams either from the file or from the network.
* */

public class A {
    public static void main(String[] args) {
//        byte b = 128; // CE:- Possible loss of precision found int required byte.
//        byte b = 10.5; // CE:- Possible loss of precision found float required byte.
//        byte b = true; // CE:- Incompatible types found boolean required byte.
//        byte b = "suresh"; // CE:- Incompatible types found java.lang.String required byte.
        System.out.println();

    }
}
