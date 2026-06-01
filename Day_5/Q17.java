import java.util.*;
public class Q17 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number =");
        int n = sc.nextInt();
        int sum = 0;
        for(int idx = 1; idx<n;idx++){
            if(n%idx==0){
                sum = sum+idx;
            
            }
        }
        if(sum==n){
            System.out.println("Perfect number ");
        }else{
            System.out.println("Not Perfect number");
        }
    }
}
        
