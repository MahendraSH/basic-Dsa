package partice;

import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class pra6 {
    public static void main(String[] args) throws  IOException {

        BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the uname id and slary in one line ");
//
        StringTokenizer details =new StringTokenizer(cin.readLine(),",");
//        System.out.println();
        System.out.println("The uaname = "+details.nextToken()+
                "the id ="+Integer.parseInt(details.nextToken())+
        "the salary ="+Float.parseFloat(details.nextToken()));
    }
}
