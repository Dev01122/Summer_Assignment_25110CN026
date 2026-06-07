import java.util.*;
public class Q41{
public static int sum (int a,int b) {
        int result=a+b;
        return result;
}
        public static void main(String[]args){
            Scanner sc = new Scanner ( System.in);
            System.out.print("Enter value of a = ");
            int a = sc.nextInt();
            System.out.print("Enter value of b = ");
            int b = sc.nextInt();
            int addition = sum(a,b);
            System.out.println("Sum of two number = "+addition);
        }

    }
