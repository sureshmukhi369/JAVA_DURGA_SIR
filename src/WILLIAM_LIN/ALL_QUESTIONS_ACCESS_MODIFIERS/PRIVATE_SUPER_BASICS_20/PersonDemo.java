package WILLIAM_LIN.ALL_QUESTIONS_ACCESS_MODIFIERS.PRIVATE_SUPER_BASICS_20;

//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.age);
//    }
//}
//
//class Person {
//    private int age = 27;
//}


/*

[Person Class]
 ├── age (private)
 │     🔒 Locked inside Person
 └── accessible only within Person’s own methods

[Main Class]
 └── Object p → has Person's data, but cannot touch private fields directly
        🔒 Cannot access p.age directly
 */



// ======================== SOLUTION



public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        int age = person.getAge();
        System.out.println("My age is " +age);
    }
}

class Person {
    private int age = 27;

    public int getAge() {
        return age;
    }
}


/*

[Person]
 ├── age (private)
 └── getAge() → public door 🚪
       ↑
       Main calls this door to peek inside safely

 */