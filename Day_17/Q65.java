import java.util.*;
public class Q65{
    public static void main(String []args){
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter size of 1st array= ");
        int a = sc.nextInt();
        int []arr1=new int[a];
        System.out.println("Enter Elements=");
        for(int i = 0;i<a;i++)
            arr1[i]=sc.nextInt();
        System.out.print("Enter size of 2nd array= ");
        int b = sc.nextInt();
        int[]arr2=new int[b];
        System.out.println("Enter elements=");
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
            int []merge =new int[a+b];
            for(int i= 0;i<a;i++)
                merge[i]=arr1[i];
            for(int i = 0;i<b;i++)
                merge[a+i]=arr2[i];
            System.out.println("Merged array = ");
            for(int x : merge)
                System.out.print(x + " ");

        }

    }
