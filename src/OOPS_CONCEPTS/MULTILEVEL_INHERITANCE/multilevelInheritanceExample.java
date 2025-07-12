package OOPS_CONCEPTS.MULTILEVEL_INHERITANCE;

public class multilevelInheritanceExample {
    public static void main(String[] args) {
        child5 child5 = new child5();
        child5.showGrandParent();
        child5.showParent5();
        child5.showChild5();
    }
}

class grandParent {
    grandParent() {
        System.out.println("grandParent Constructor");
    }
    void showGrandParent() {
        System.out.println("I am grandParent");
    }
}

class parent5 extends grandParent {
    parent5() {
        System.out.println("parent Constructor");
    }
    void showParent5() {
        System.out.println("I am parent5");
    }
}

class child5 extends parent5 {
    child5() {
        System.out.println("child5 Constructor");
    }
    void showChild5() {
        System.out.println("I am child5");
    }
}