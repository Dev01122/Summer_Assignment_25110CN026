import java.util.*;
public class Q24{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x=");
            double x = sc.nextDouble();
            System.out.print("Enter power =");
            int b = sc.nextInt();
            if(x==1){
                System.out.println(1);
                return ;
            }
            if(x==-1){
                if(b%2==0)
                System.out.println(1);
            else
                System.out.println(-1);
            return;
            }
            long n =b;
            if(n<0){
                x=1.0/x;
                n=-n;
            }
            double res = 1;
            for(long idx =1;idx<=n&&res!=0;idx++){
                res = res*x;
            }
            System.out.println("Answer="+res);
        }
    }
            
