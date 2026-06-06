import java.util.*;
    public class Q40{
        public static void main(String[]args){
          
            for(int i=1;i<=5;i++){
                for(int j=1;j<=5-i;j++){
                    System.out.print(" ");
                }
                 for(int j=0;j<i;j++){
                    System.out.print((char)('A'+j));
                 }
                 for(int k=i-2;k>=0;k--){
                    System.out.print((char)('A'+k));

                 }
                System.out.println();
            }
        }
    }
