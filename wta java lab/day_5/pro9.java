// thows exeptions
// checked exection

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ABuffer  {
  void   displayAndPrint() throws IOException {
      System.out.println("Enter a line of text");
      BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));
      String c = cin.readLine();
      System.out.println(c);

    }
}
public class pro9 {
    public static void main(String[] args) throws  IOException{
        ABuffer a=new ABuffer();
        a.displayAndPrint();

    }
}
