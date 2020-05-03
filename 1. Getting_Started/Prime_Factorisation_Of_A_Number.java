/**
 * Prime_Factorisation_Of_A_Number
 */
import java.util.*;
public class Prime_Factorisation_Of_A_Number {
    	    public static void main(String[] args) {
    	    int n;
      Scanner scn = new Scanner(System.in);
      n = scn.nextInt();
      
      for(int i = 2; i< Math.sqrt(n); i++) {
         while(n%i == 0) {
            System.out.print(i+" ");
            n = n/i;
         }
      }
      if(n >2) {
         System.out.print(n);
      }
      scn.close();
            
    	    }
    }

  
