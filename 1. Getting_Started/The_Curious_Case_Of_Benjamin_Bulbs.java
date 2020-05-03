/**
 * The_Curious_Case_Of_Benjamin_Bulbs
 */
import java.util.*;
public class The_Curious_Case_Of_Benjamin_Bulbs{
  	  public static void main(String[] args) {
  	  	  Scanner scn = new Scanner(System.in);
          int num = scn.nextInt();
          
          for(int i = 1; i <= Math.sqrt(num); i++){
         System.out.println((int)Math.pow(i,2));
          }
          scn.close();
  	  }
  }
