import java.util.*;
public class Q48{
    public static boolean isPerfect(int n){
        if(n<=1){
            return false;
        }
        int sum = 0;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum == n ;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
                System.out.print("Enter number=");
                int n = sc.nextInt();
                if(isPerfect(n)){
                    System.out.println("The given number is perfect number.");
                }else{
                    System.out.println("The given number is not a perfect number");
                }
            }
        }
    

        
    


