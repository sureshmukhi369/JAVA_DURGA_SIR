package OOPS_CONCEPTS.inher.OOPS_CONCEPTS.Inheritance;

public class inheritVariables {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.showInfo();
    }
}

class Parent2 {
    String name = "Suresh";
    int age = 30;
}

class Child2 extends Parent2 {
    void showInfo() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}
