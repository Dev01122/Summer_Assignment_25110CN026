import java.util.*;
public class Q18 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number =");
        int n = sc.nextInt();
        int temp = n,sum=0;
        while(n>0){
            int rem = n%10;
            int fact=1;
            for(int idx =1;idx<=rem;idx++){
                fact=fact*idx;

            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}