package WILLIAM_LIN.ALL_QUESTIONS_OOPS_CONCEPT.INHERITANCE_ALL_QUESTIONS.INHERITANCE_SUPER_BASICS;

public class InheritanceSimpleV1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayChild();
        child.displayParent();
    }
}

class Parent {
    void displayParent() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is child class method");
    }

}
