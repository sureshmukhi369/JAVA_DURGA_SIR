package OOPS_CONCEPTS.INHERITANCE;

public class methodOverrideExample {
    public static void main(String[] args) {
        child3 child3 = new child3();
        child3.show();
    }
}

class parent3 {
    void show() {
        System.out.println("Parent Method");
    }
}

class child3 extends parent3 {
    @Override
    void show() {
        super.show();   // We can use here super keyword to call parent3 class method and print Parent Method.
        System.out.println("Child method");
    }
}