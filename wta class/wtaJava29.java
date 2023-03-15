// multilevel inhertance

class One{
    int n1;
    One(int n1){
    this.n1=n1;
    }
}
class two{
    int n2;
    two(int n2){
        this.n2=n2;
    }
}
class three{
    int n3;
    three(int n3){
        this.n3=n3;
    }
    void display(){
        System.out.println("The three ="+n3);
        System.out.println("The tw0 ="+n3);
        System.out.println("The One ="+n3);
    }
}

public class wtaJava29 {
    
    public static void main(String[] args) {

        One one=new One(10);
        two two=new two(20);
        three three=new three(30);

        
        three.display();
        
    }
}
