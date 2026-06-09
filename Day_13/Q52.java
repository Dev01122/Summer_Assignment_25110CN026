import java.util.*;
public class Q52{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size=");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " number");
        int[]arr=new int[n];
        int even = 0,odd=0;
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] %2 ==0 ) {
                even ++;
            }else{
            odd++;
            }
        }
        System.out.println("Number of even elemnts = " +even);
        System.out.println("Number of odd elemnts = " +odd);
        

    }
}
