import java.util.*;
public class Q15 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number  =");
        int n = sc.nextInt();
        int temp = n , sum =0;
        while(n>0){
            int rem = n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number");

        }else{
            System.out.println("Not Armtong Number");
        }
    }
}
