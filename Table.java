import java.util.*;
public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();
        for(int idx=1;idx<=10;idx++){
            System.out.println(n+"*"+idx+"="+(n*idx));
        }
    }
    
}
