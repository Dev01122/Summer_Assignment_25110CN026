import java.util.*;
public class Q21{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number=");
            int n = sc.nextInt();
            int binary = 0;
            int digit = 1;
            while(n>0){
                int rem = n%2;
            binary = binary+rem*digit;
            digit=digit*10;
            n=n/2;
                    }
        
        System.out.println("Binary of given number = "+binary);
    }
}