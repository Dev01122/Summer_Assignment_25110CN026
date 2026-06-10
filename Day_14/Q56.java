import java.util.*;
public class Q56{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array =");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter elements of an array = ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elemnts are ");
        for(int i =0;i<n;i++){
            boolean duplicate = false;
        for(int j = 0;j<i;j++){
            if(arr[i]==arr[j]){
                duplicate=true;
                break;
            }
        }
            if (duplicate)
            System.out.println(arr[i]);
    }
    }
}
