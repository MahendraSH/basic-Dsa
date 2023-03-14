
//  default and parameter constructor
class Person {
    private int age;
    private String name;

    Person() {
        name = "sri ram ";
        age = 20;
    }

    Person(String name, int age) {
        this.age = age;
        this.name = name;

    }

    void talk() {
        System.out.println("My is " + name + "Myis age" + age);
    }
}

public class wtaJava14 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("xyz", 20);
        p1.talk();
        p2.talk();
    }
}
