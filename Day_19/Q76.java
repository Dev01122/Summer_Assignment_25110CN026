import java.util.*;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows = ");
        int r = sc.nextInt();

        System.out.print("Enter columns = ");
        int c = sc.nextInt();

        if(r != c) {
            System.out.println("Diagonal sum is possible only for square matrix.");
            return;
        }

        int a[][] = new int[r][c];
        int sum = 0;

        System.out.println("Enter matrix:");

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for(int i = 0; i < r; i++) {
            sum += a[i][i];
        }

        System.out.println("Sum of Diagonal elements = " + sum);
}
}