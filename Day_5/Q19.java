import java.util.*;
public class Q19 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number =");
        int num = sc.nextInt();
        System.out.println("Factors are:");
        for(int idx =1;idx<=num;idx++){
            if (num%idx==0){
                System.out.print(idx + " ");
            }
        }
    }
}
