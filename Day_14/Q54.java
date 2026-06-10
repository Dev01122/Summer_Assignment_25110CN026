import java.util.*;
public class Q54{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array =");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter elements of an array = ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("Enter your frequency element =");
        int key = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if (arr[i]==key){
                count++;
            }
        }
            System.out.println("Frequency of an element="+count);
    }
    }