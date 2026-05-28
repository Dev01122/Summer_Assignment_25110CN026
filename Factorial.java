import java.util.*;
    public class Factorial{
        public static void main (String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.print("Enter number = ");
            int n = sc.nextInt();
            int fact=1;
            for(int idx=1;idx<=n;idx++){
                fact=fact*idx;
            }
            System.out.println("Factorial of given number = "+fact);


        }
    }
