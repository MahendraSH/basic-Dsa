

public class prolab7 {
    public static void main(String[] args) {
        int []arr=new int[Integer.parseInt(args[0])];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= Integer.parseInt(args[i+1]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                  int  temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
}