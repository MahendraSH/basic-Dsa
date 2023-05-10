import java.net.*;
import java.io.*;

class ClientServer1 {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        int x, y;

        x = din.readInt();
        y = din.readInt();
        System.out.println("Input given is " + x + " " + y);

        dout.writeInt(x + y);
        dout.flush();

        din.close();
        s.close();
        ss.close();
    }
}
