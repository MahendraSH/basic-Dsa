package _4_.ArraylistinJava;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDlist {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                list.get(i).add(cin.nextInt());

            }
        }
        System.out.println(list);
    }
}
