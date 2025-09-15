package OOPS_CONCEPTS.INHERITANCE;

public class inheritanceExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.showChild();
        child.showParent();
    }
}

class Parent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent{
    void showChild() {
        System.out.println("I am Child");
    }
}
