package WILLIAM_LIN.ALL_QUESTIONS_ACCESS_MODIFIERS.PRIVATE_SUPER_BASICS_20.USING_GETTER_SETTER;

public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person();
        int oldAge = person.getAge();
        System.out.println("My old is " + oldAge);

        person.setAge(28);
        int newAge =person.getAge();
        System.out.println("My new age is " + newAge);
    }
}

class Person {
    private int age = 27;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
