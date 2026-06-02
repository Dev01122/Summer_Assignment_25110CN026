import java.util.*;
public class Q22{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number=");
            int n = sc.nextInt();
            int decimal = 0;
            int digit = 1;
            while (n>0){
                int rem=n%10;
                decimal = decimal+rem*digit;
                digit=digit*2;
                n=n/10;
            }
            System.out.println("Decimal of given number = " + decimal);
        }
    }