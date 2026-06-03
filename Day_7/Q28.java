import java.util.*;
public class Q28{
    static int reverse= 0;
    public static void reverse_number (int n){
        if(n==0){
            return ;
        }
            reverse = reverse * 10 + n%10;
            reverse_number(n/10);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            reverse_number(n);
            System.out.println("Reverse of given number="+reverse);

        }
    }


