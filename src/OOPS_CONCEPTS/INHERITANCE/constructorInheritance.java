package OOPS_CONCEPTS.INHERITANCE;

public class constructorInheritance {
    public static void main(String[] args) {
        child4 child4 = new child4("Suresh");
    }
}

class parent4 {
    parent4(String name) {
        System.out.println("Parent " + name);
    }
}

class child4 extends parent4 {
    child4(String name) {
        super(name);
        System.out.println("Child " + name);
    }
}