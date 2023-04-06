package partice;

class PersonTalk{
    String name="xyz";
    int age=100;
      void talk(){
    System.out.println("My name is "+name +" My age is "+age);
}
}
public class pra13 {
    public static void main(String[] args) {
        PersonTalk p1=new PersonTalk();
        p1.talk();
        p1.name="Mahendra";
        p1.age=20;
        p1.talk();
        System.out.println("The hashcode of obj is "+p1.hashCode());

//
    }
}
