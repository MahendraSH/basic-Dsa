import java.net.*;
import java.util.Scanner;
import java.io.*;

class Clinet3 {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 333);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner si = new Scanner(System.in);
        int str2;
        int a, b;
        System.out.println("Enter the two integers");
        a = si.nextInt();
        b = si.nextInt();
        dout.writeInt(a);
        dout.writeInt(b);

        dout.flush();
        str2 = din.readInt();
        System.out.println("Server says the output is: " + str2);

        dout.close();
        s.close();
    }
}