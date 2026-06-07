import java.util.*;
public class Q44{
    public static int factorial(int n){
        if(n<0){
            System.out.println("Factorial is not defined for negative number.");
            return -1;
        }
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n=");
        int n = sc.nextInt();
        
        int fact=factorial(n);
        if (fact !=-1){
        System.out.println("Factorial of "+n+"="+fact);
    }
}
}



