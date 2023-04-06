package partice;
// sorting the list of float using comnad line args
public class pra12 {
    public static void main(String[] args) {
        int n= args.length;
        float []a=new float[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Float.parseFloat(args[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j]){
                    float temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

        System.out.println("After sorting");

        for(float i : a){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
