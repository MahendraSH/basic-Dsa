public class String2 {
    public static void main(String[] args) {
        String []arr ={
                "Mahendra","Maahi","ajai","raju","fool"
        };
        for(int i=0;i< arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i].compareToIgnoreCase(arr[j])>0){
                    String temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(String s : arr){
            System.out.println(s);
        }
    }
}
