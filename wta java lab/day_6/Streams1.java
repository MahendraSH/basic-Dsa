import java.io.*;

public class Streams1 {
    public static void main(String[] args) throws IOException ,Exception {

       FileInputStream fin=new FileInputStream("my.txt");
        BufferedReader cin=new BufferedReader(new InputStreamReader(fin));

        String s;
        int countLines =0;
        int countwords =0;
        int countChars=0;

        while (( s=cin.readLine())!=null){

            for(String c : s.split(" ")){
                countwords++;
                countChars+=c.length();
            }

 countLines++;
        }

        System.out.println("The numnber of lines = "+countLines +" \n the number of words ="+countwords +"\n the number of chars = "+countChars);



    }
}
