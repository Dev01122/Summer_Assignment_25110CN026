import java.util.*;
public class Q53{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array =");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter elements of an array = ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter elemts to be search from array=");
        int key = sc.nextInt();
        int pos = -1;
        for(int i=0;i<n;i++){
            if (arr[i]==key){
                pos=i;
                break;
            }
        }
        if(pos !=-1){
        System.out.println("Element found at "+pos+" index");

        }else{
             System.out.println("Element not found");
        }
    }
    
}

