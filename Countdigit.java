import java.util.*;
public class Countdigit {
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter number=");
    int n = sc.nextInt();
    int count =0;
    for(; n!=0 ; n=n/10){
        count++;
        
    }
    System.out.println("Number of digits = " + count);
}  
}
