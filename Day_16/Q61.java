import java.util.*;
public class Q61{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
            System.out.print("Enter number =");
            int n = sc.nextInt();
            int[]arr=new int[n-1];
            System.out.println("Enter "+(n-1)+" elements");
            int arrSum=0;
            for(int i = 0;i<n-1;i++){
               arr[i] = sc.nextInt();
               arrSum += arr[i]; 
            }
            int sum = n * (n + 1) / 2;
            int missing = sum - arrSum;

            System.out.println("Missing Number of an array = " + missing);
            }
        }
    

