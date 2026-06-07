import java.util.*;
public class Q42{
    public static int Maximum(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter value of b = ");
        int b = sc.nextInt();
        int max = Maximum(a,b);
        System.out.println("The maxium number = " + max);
    }
}