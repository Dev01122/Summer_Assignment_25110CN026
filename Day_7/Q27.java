import java.util.*;
public class Q27{
    public static int Sumofdigits (int n){
        if(n==0){
            return 0;
        }
            return(n%10)+Sumofdigits(n/10);
   
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            System.out.println("Sum of digits="+Sumofdigits(n));

        }
    }


