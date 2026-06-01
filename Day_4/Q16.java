import java.util.*;
public class Q16 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter beginning number  =");
        int beginning = sc.nextInt();
        System.out.print("Enter ending number  =");
        int end = sc.nextInt();
        System.out.println("Armstrong Numbers : ");
        for(int idx = beginning ; idx <= end ; idx++){
            int num = idx , sum =0;
        
        while(num>0){
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        if (sum==idx){
            System.out.print(idx+ " ");
        }
    }
}
}
            