import java.util.*;
public class Q50{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number=");
        int n = sc.nextInt();
        int[]arr=new int[n];
        int sum = 0;
        System.out.println("Enter " +n+ " number");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Sum of array="+sum);
        System.out.println("Average of array="+avg);

    }
}