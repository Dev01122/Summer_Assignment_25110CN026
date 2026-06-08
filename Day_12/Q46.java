import java.util.*;
public class Q46{
    public static int isArmstrong(int n){
            int original = n;
            int temp=n;
            int digits = 0;
            int sum = 0;
            while(temp>0){
                digits++;
                temp=temp/10;
            }
            temp=n;
            while(temp>0){
                int rem = temp%10;
                sum = sum +(int) Math.pow(rem,digits);
                temp=temp/10;
            }
            if(original==sum){
                return 1 ;
            }else{
            return 0;
    }
}
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n = ");
        int n = sc.nextInt();
        if(isArmstrong(n)==1){
            System.out.println("The given number is an Armstrong number");
        }else{
            System.out.println("The given number is not an Armstrong number" );
        }
        }
    }

