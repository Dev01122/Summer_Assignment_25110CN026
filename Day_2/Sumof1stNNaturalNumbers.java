import java.util.*;
public class Sumof1stNNaturalNumbers{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number=");
        int n = sc.nextInt();
        int sum=0;
        for(int idx=1;idx<=n;idx++){
            sum=sum+idx;
        }
        System.out.println("Sum of "+n+" natural number="+sum);
    }
}