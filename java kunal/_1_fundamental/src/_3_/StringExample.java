package _3_;

public class StringExample {
    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(greetmy("Mahendra"));

    }

     static String greetmy(String name) {
        return "hello "+name;
    }

    static  String greet(){
        String s="hi how are ?";
        return s;
    }
}
