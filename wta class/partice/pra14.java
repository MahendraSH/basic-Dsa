package partice;

class PersonTalkOne{
    private  int age;
    private  String name ;
    PersonTalkOne() {
        age=20;
        name ="djsssssssd";
    }
    PersonTalkOne(String name , int age){

        this.name =name;
        this.age=age;


    }
    void talk(){
        System.out.println("my name ="+name +
                "my age is ="+age);
    }
}
public class pra14 {
    public static void main(String[] args) {
//        default and parameterized constructor
        PersonTalkOne p1=new PersonTalkOne();
        PersonTalkOne p2=new PersonTalkOne("sdhnus",044);
        p1.talk();
        p2.talk();
    }
}
