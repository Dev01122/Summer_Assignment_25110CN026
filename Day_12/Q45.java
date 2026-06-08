import java.util.*;
public class Q45{
    public static boolean isPalindrome(int n){
            int original = n;
            int reversed = 0;
            while(n>0){
                int rem = n%10;
                reversed = reversed * 10 + rem;
                n=n/10;
            }
            return original==reversed;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("The given number is Palindrome number");
        }else{
            System.out.println("The given number is not a Palindrome number" );
        }
        }

    }

