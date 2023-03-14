// if u do not use supper key work
// why to use supper key word

//  which construct is called in this

class One{
    int i=10;
    One(){
        System.out.println("i from one ="+i);
    }
}
class Second extends One{
    int i=20;
    Second(){
        System.out.println("i from second ="+i);
    }
}
public class wtaJava24 {
    public static void main(String[] args) {
    
        Second s=new Second();

        System.out.println();
    
        
    }
}

// first it calls all  parent class of supper class constructor and the its constructs

