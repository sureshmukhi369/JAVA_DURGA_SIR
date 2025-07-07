package FLOW_CONTROL_PART_2_VIDEO_25;

public class A {
    public static void main(String[] args) {
        boolean x = true;
        if (x = false) {
            System.out.println("hellow");
        }
        else {
            System.out.println("HI");
        }
    }
}

/*
* if (true)
* Sop("hell");// valid
*
* if (true);// valid
*
*
* if (true)
* int x = 10;  // invalid
*
*
* if (true)
* {
* int x = 10;// valid
* }
*
*
* Semi coln(;) which also know as empty statement.
*
* there is no gangling else problem in java.
* Every else is mapped to the nearest if in java.
*
*
* */