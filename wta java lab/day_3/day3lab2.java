package day_3;
//1. Write a Java program to facilitate the multilevel inheritance. <br>
// (Also demonstrate the use of constructor in multilevel inheritance)
// multilevel inhertance

class One{
    int n1;
    One(int n1){
        this.n1=n1;
    }
    void display(){
        System.out.println("The one ="+n1);
    }
}
class Two extends One{
    int n2;
    Two(int n1,int n2){
        super(n1);
        this.n2=n2;
    }
    void display(){
        System.out.println("The two ="+n2);
        super.display();
    }
}
class Three extends Two{
    int n3;
    Three(int n1,int n2,int n3){

        super(n1,n2);
        this.n3=n3;

    }
    void display(){
        System.out.println("The three ="+n3);
        super.display();
    }
}

public class day3lab2{

    public static void main(String[] args) {

        Three three =new Three(10,20,30);

        three.display();


    }
}
