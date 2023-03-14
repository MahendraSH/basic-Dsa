package _6_.binearyserach2dArraySearch;
// matrix is  sorted in  row wise and col wise sorted

import java.util.Arrays;

public class MatrixSortedRowiseAndCOl {
    public static void main(String[] args) {
    int [][]arr={
            {
                10,20,30,40
            },
            {
                11,25,35,45
            },
            {
                28,29,37,49
            },
            {
                33,34,38,50
            }
    };

    for(int [] i :arr){
        System.out.println(Arrays.toString(i));
    }

    int target=37;

        System.out.println("target ="+target);

//        System.out.println(Arrays.toString(findTheindexes(arr,target)));
        System.out.println(Arrays.toString(findTheindexes(arr,target)));
    }

    static  int [] findTheindexes(int [][]arr,int target){
        int []ans= new int [2];
        ans[0]=-1;
        ans[1]=-1;
        int start=0;
        int end =arr[start].length-1;

//        10,20,30,40
//        11,25,35,45
//        28,29,37,49
//        33,34,38,50

        while (start < arr.length && end >= 0){
            if(arr[start][end]== target){
                ans[0]=start;
                ans[1]=end;
                return ans;
            } else if (arr[start][end] > target) {
                end --;
            }
            else {
                start ++;
            }
        }
        return  ans;

    }
}
