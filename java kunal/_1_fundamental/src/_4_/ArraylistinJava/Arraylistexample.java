package _4_.ArraylistinJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// arrylist
// add ( index, vaule)
// add (vaule)
// get (index)
//remove (index)
//
public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
//        list.add(94);
//        list.add(94);
//        list.add(94);
//        list.add(934);
//        list.add(194);
//        list.add(94);
//        list.add(943);
//        list.add(934);
//        System.out.println(list);
//        list.set(0,99999999);
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);
        Scanner cin =new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            list.add(cin.nextInt());
        }
        System.out.println(list);

         for(int i=0;i<5;i++)
         {
             System.out.print(list.get(i)+" ");
         }
        System.out.println();

    }
}
