/**
 * Reverse_A_Number
 */
import java.util.*;
public class Reverse_A_Number {
  public static void main (String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int digit;
    while (x!=0){
        digit = x%10;
        System.out.println(digit);
        x/=10;
    }
    scn.close();
   }
  
  }
  
