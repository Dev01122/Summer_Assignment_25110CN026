import java.util.*;

public class Q72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int a = sc.nextInt();
        int arr[] = new int[a];

        System.out.println("Enter elements:");
        for(int idx=0;idx<a;idx++)
            arr[idx] = sc.nextInt();

        for(int idx=0;idx<a-1;idx++) {
            for(int j=idx+1;j<a;j++) {
                if(arr[idx] < arr[j]) {
                    int temp = arr[idx];
                    arr[idx] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Descending Order:");
        for(int x : arr)
            System.out.print(x + " ");
    }
}