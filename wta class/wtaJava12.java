// wtaJava12.java
// sort the list of float using command line args

public class wtaJava12 {
    public static void main(String[] args) {
        Float []arr=new Float [args.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Float.parseFloat(args[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                  float  temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (float i : arr) {
            System.out.print(i + " ");
        }
        
    }
}