package _5_;

public class LinearSearchin2d {
    public static void main(String[] args) {
        int [][]a={
                {1,232,42,42,42},
                {2,342,2,44,5},
                {23,345,35}
        };
        int target =44;
        System.out.println(linearSearchin2d(a,target));

    }
    static  int linearSearchin2d(int [][]arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j])
                {
                    return target;
                }

            }
        }
        return -1;
    }
}
