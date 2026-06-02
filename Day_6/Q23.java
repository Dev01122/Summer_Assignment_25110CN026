import java.util.*;
public class Q23{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number=");
            int num = sc.nextInt();
            int count = 0;
            while(num>0){
                int rem = num%2;
                if(rem==1){
                    count ++;

                }
                num=num/2;

            }
            System.out.println("Number Set Bits="+count);
        }
    }