package DataTypesVariableArrays;
//Compute light travel using long data type
public class pro1 {
    public static void main(String[] args) {

        long lightSpeed =186000; // miles per second
        long days ;
        long seconds;
        long distance ;
        days =1000;
        seconds= days*24 * 3600 ;
        distance = lightSpeed* seconds;
        System.out.println("the distance traveled  by light   in miles is "+distance);



    }
}
