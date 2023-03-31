// multilevel inhertance

class One2{
    int n1;
    One2 (int n1){
    this.n1=n1;
    }
    void display(){
        System.out.println("The one ="+n1);
    }
}
class Two2 extends One2{
    int n2;
    Two2(int n1,int n2){
        super(n1);
        this.n2=n2;
    }
    void display(){
        System.out.println("The two ="+n2);
            super.display();
    }
}
class Three2 extends Two2{
    int n3;
    Three2(int n1,int n2,int n3){

        super(n1,n2);
        this.n3=n3;

    }
    void display(){
        System.out.println("The three ="+n3);
        super.display();
    }
}

public class wtaJava29 {
    
    public static void main(String[] args) {

    Three2 three =new Three2(10,20,30);
    
    three.display();

        
    }
}
