package DataTypesVariableArrays;

import java.security.spec.RSAOtherPrimeInfo;

//Demonstrate of  block scope
public class pro6 {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            int y=-1;
            System.out.println("The y : "+y);
            y+=200;
            System.out.println("The y-----> :"+y );

        }
    }
}
