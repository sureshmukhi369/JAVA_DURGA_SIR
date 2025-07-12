package OOPS_CONCEPTS.OOPS_CONCEPTS.INHERITANCE;

public class inheritanceExtraMethods {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.showChild();
        child1.showParent();
        child1.extraChildMethod();
    }
}

class Parent1 {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child1 extends Parent1 {
    void showChild() {
        System.out.println("I am Child");
    }
    void extraChildMethod() {
        System.out.println("I am Extra method");
    }
}