import java.util.Scanner;

// ass4.java
// sort array using bubble sort

public class ass4 {
    public static void main(String[] args) {
        System.out.println("Enter the number of eles");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the eles");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
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