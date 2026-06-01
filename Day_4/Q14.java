import java.util.*;
public class Q14 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number =");
        int n = sc.nextInt();
        int a =0,b=1,c;
        if (n==1){
            System.out.println("nth Fibonacii term = 0");

        }else if (n==2){
            System.out.println("nth Fibonacii term = 1");
        }else{
            for(int idx =3;idx<=n;idx++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println("nth Fibonacci term = " + b);
        }
    }
}
    
        
