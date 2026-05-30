import java.util.*;
public class Q12 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st number =");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number =");
        int b = sc.nextInt();
        int big = (a>b)?a:b;
        int lcm = big;
        while (true){
            if (lcm % a == 0 && lcm %b ==0){
                break ;
            }
            lcm ++ ;
        }
        System.out.println("LCM of given numbers = " + lcm);
    }
}