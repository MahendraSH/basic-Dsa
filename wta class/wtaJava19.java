// write a progarm to test static method can exess instance variable

class Demo{
    private int n1;
    private int n2;
    static int sum()
    {
        return n1+n2;
    }
}
public class wtaJava19 {
    public static void main(String[] args) {
        System.out.println(Demo.sum());
    }
}


// wtaJava19.java:8: error: non-static variable n1 cannot be referenced from a static context
//         return n1+n2;
//                ^
// wtaJava19.java:8: error: non-static variable n2 cannot be referenced from a static context      
//         return n1+n2;
//                   ^
// 2 errors
