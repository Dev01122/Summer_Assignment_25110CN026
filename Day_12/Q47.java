import java.util.*;
public class Q47{
    public static void fibonacci(int n){
            int a = 0,b=1;
            for(int idx=1;idx<=n;idx++){
                System.out.print(a+ " ");
                int c=a+b;
                a=b;
                b=c;
            }
        }
            public static void main(String []args){
                Scanner sc = new Scanner (System.in);
                System.out.print("Enter number =");
                int n = sc.nextInt();
                fibonacci(n);

            }
        }

            