import java.util.*;
      
      public class pattern10{
      
      public static void main(final String[] args) {
          final Scanner scn = new Scanner(System.in);
          final int n = scn.nextInt();
          
          int ospaces = n/2;
          int ispaces = -1;
          
         for (int r =1; r <=n; r++){
            for (int c1 = 1; c1<= ospaces; c1++){
                System.out.print("\t");
                }
            System.out.print("*\t");

            for (int c2 = 1; c2<= ispaces; c2++){
                    System.out.print("\t");
                    }
            if (r>1 && r<n){
                        System.out.print("*\t");  
                    }  
             if (r <= n/2){
                ospaces--;
                ispaces+=2;
             }
             else {
                ospaces++;
                ispaces-=2;
             }
             
             System.out.println();
            }
             
            scn.close(); 
         }
     }
    
