import java.util.*;
public class Q13 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of term =");
        int n = sc.nextInt();
        int a =0, b= 1;
        System.out.print("Fibonacci series = ");
        for(int idx=1;idx<=n;idx++){
            System.out.print(a + " ");
            int c =a+b;
            a=b;
            b=c;
        }
        
    }
}