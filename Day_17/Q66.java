import java.util.*;

public class Q66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr1)
            set.add(x);

        for(int x : arr2)
            set.add(x);

        System.out.println("Union of arrays:");
        for(int x : set)
            System.out.print(x + " ");
    }
}