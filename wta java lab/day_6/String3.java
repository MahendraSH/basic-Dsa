import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner cin=new Scanner( System.in);
        System.out.println("Eneter the string");
        String s =cin.next();
        char []arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[s.length()-1-i]=s.charAt(i);
        }
        String str=new String(s);
        System.out.println(" is plaindrome or not "+s.equals(str));

    }
}
