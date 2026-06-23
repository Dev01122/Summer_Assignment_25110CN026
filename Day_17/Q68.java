import java.util.*;

public class Q68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array = ");
        int a = sc.nextInt();
        int arr1[] = new int[a];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array = ");
        int b = sc.nextInt();
        int arr2[] = new int[b];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Common Elements = ");

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}