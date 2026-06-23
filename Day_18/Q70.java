import java.util.*;

public class Q70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int idx=0;idx<n;idx++)
            arr[idx] = sc.nextInt();

        for(int idx=0;idx<n-1;idx++) {
            int min = idx;

            for(int j=idx+1;j<n;j++) {
                if(arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[idx];
            arr[idx] = arr[min];
            arr[min] = temp;
        }

        System.out.println("Sorted Array:");
        for(int x : arr)
            System.out.print(x + " ");
    }
}