
//  default and parameter constructor
class PersonOne {
    private int age;
    private String name;

    PersonOne() {
        name = "sri ram ";
        age = 20;
    }

    PersonOne(String name, int age) {
        this.age = age;
        this.name = name;

    }

    void talk() {
        System.out.println("My is " + name + "Myis age" + age);
    }
}

public class wtaJava14 {
    public static void main(String[] args) {

        PersonOne p1 = new PersonOne();
        PersonOne p2 = new PersonOne("xyz", 20);
        p1.talk();
        p2.talk();
    }
}
