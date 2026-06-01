import java.util.*;
public class Q20 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number =");
        int num = sc.nextInt();
        int largest = 1;
        for(int idx =2;idx<=num;idx++){
            while(num%idx==0){
                largest=idx;
                num=num/idx;
            }
        }
        System.out.println("Largest prime factor ="+largest);
    }
}
