// person class exmple 
// with name and age and take function

class Person{
    String name;
    int age;
    void takeFunction(){
        System.out.println("Hello  my name is " + name +" and my age is "+age);
    }
}

public class wtaJava13{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Mahendra";
        p1.age=22;
        p1.takeFunction();
        Person p2=new Person();
        p2.takeFunction();
        System.out.println("hashcode fo p1 = " + p1.hashCode());
        System.out.println("hashcode fo p2 = " + p2.hashCode());

        //hashcode is used to exess the object of the class 
        
    }
}