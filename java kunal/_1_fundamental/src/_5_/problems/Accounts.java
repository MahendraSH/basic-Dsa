package _5_.problems;

public class Accounts {
    public static void main(String[] args) {

        int [][]arr={
                {
                    12,40,40
                },{
                    23,43,3
        },{
                    100,100,10
        }
        };
       int ans= findRichest(arr);
        System.out.println(ans);
    }
    static int findSumofeachAcc(int []arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    static int  findRichest(int [][]arr){
        int ans =Integer.MIN_VALUE;
        for(int []i:arr){
            int sum=findSumofeachAcc(i);
            if(sum>ans)
                ans=sum;
        }
        return ans;
    }
}

