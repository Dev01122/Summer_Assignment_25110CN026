import java.util.*;
public class Q10 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter starting number =");
        int n = sc.nextInt();
        System.out.print("Enter last number=");
        int last = sc.nextInt();
        for (int i = n ; i<=last ; i++){
            boolean isPrime = true;

            if(i<2){
                isPrime = false;
            }else{
                for(int m =2;m*m<=i;m++ ){
                    if(i%m==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}