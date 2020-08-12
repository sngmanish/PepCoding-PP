import java.util.*;
      
      public class pattern16{
      
      public static void main(final String[] args) {
          final Scanner scn = new Scanner(System.in);
          final int n = scn.nextInt();
          int stars =1;
          int spaces = 2*n -3;
          int value = 1;
         
            
         for (int r =1; r <=n; r++){
             int nvalue = value; 
             for (int c1 = 1; c1<= stars; c1++){
             System.out.print(nvalue + "\t");
             nvalue ++;
             }
             for (int c2 = 1; c2<= spaces; c2++){
                System.out.print("\t");
                }
            
                if (r==n ){
                    stars--;
                }
            for (int c3 = 1; c3<= stars; c3++){
                    System.out.print(value +"\t");
                    nvalue --;
                 }

             stars ++;
             spaces -=2;
             
            
             
             System.out.println();
            }
             
            scn.close(); 
         }
        }
    
