import java.util.*;
      
      public class pattern15{
      
      public static void main(final String[] args) {
          final Scanner scn = new Scanner(System.in);
          final int n = scn.nextInt();
          int stars =1;
          int spaces = n/2;
          int value = 1 ;
            
         for (int r =1; r <=n; r++){
            for (int c1 = 1; c1<= spaces; c1++){
                System.out.print("\t");
                }
            
            int nvalue = value;
             for (int c2 = 1; c2<= stars; c2++){
             System.out.print(nvalue + "\t");
             if (c2 <= stars/2){
                 nvalue ++;
                }
                else {
                nvalue --;
                }
             }
             
             
             if (r <= n/2){
                spaces--;
                stars+=2;
                value ++;
             }
             else {
                 spaces++;
                 stars-=2;
                 value --;
             }
             
             System.out.println();
            }
             
            scn.close(); 
         }
        }
    
