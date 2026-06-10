import java.util.*;
public class Q55{
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of array =");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter elements of an array = ");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest = Integer .MIN_VALUE;
        int secondlargest = Integer .MIN_VALUE;

        for(int i=0;i<n;i++){
            if (arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if (arr[i]>secondlargest && arr[i]!= largest){
                secondlargest = arr[i];
            }
        }
            System.out.println("Second llargest of  an element="+secondlargest);
    }
    }