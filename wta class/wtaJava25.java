// write a class Supper1 with an instance var and show method 
// extend a class sub1 from supper1 and rewite the instance var and show method
//  make  an obj of sub class and call show method

// why to use supper key word

class  SupperOne{
    int i=100;
    public void show(){
        System.out.println("supper1  i = "+i);
    }
}

class SubOne extends SupperOne{
    int i=200;
    public void show(){
        System.out.println("sub1  i = "+i);
    }
}



public class wtaJava25 {
    
    public static void main(String[] args) {
        
           SubOne sub=new SubOne();
           sub.show();
           
    }
}
