package pack1.pack2.pack3;

import pack1.ADD;
import pack1.pack2.Sub;

public class Calculate {
    public  void cal(int a,int b){
        ADD add =new ADD();
        Sub sub= new Sub();

        System.out.println("the sum = "+add.add(a,b));
        System.out.println("the sub = "+sub.sub(a,b));



    }
}
