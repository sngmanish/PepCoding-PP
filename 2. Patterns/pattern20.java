import java.util.*;
      
      public class pattern20{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          //First make square divide it into 5 parts 
           
         for (int r =1; r <=n; r++){
             for (int c = 1; c<=n; c++){
                 if (c==1 || c==n ){
                      System.out.print("*\t");  
                 }
                
                 else if (r>n/2 &&(r==c || r+c==n+1)){
                        System.out.print("*\t");
                     }
                 else{
                    System.out.print("\t");
                 } 
             }
              System.out.println();
             scn.close(); 
         }
        }
    }