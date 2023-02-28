package _5_;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String str=cin.next();
        char c=cin.next().charAt(0);

        System.out.println(searchStrchar(str,c));
        System.out.println(searchStrchar2(str,c));

    }
    static   boolean searchStrchar(String s, char target){
        for(char i : s.toCharArray()){
            if(target==i)
                return true;
        }
        return false;
    }static   boolean searchStrchar2(String s, char target){
        for(int i=0;i<s.length();i++)
        {
            if(target==s.charAt(i))
            {
                return true;
            }
        }
        return false;
    }

}
