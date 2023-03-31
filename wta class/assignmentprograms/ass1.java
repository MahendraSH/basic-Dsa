package assignmentprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// ass1.java

public class ass1  {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter two number ");
        BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token =new StringTokenizer(cin.readLine());
        int n1=Integer.parseInt(token.nextToken());
        int n2=Integer.parseInt(token.nextToken());
        System.out.println("sum ="+(n1+n2));
        System.out.println("diff ="+(n1-n2));
        System.out.println("mul ="+(n1*n2));
        System.out.println("div ="+(n1/n2));
        System.out.println("rem ="+(n1%n2));

        
    }
}
