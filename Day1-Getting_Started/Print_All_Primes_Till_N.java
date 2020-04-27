/**
 * Print_All_Primes_Till_N
 */
import java.util.*;
public class Print_All_Primes_Till_N {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    
    
    for (int i=a ; i<=b ; i++){
    int div = 2;
      while(div * div <= i){
          if(i % div == 0){
              break;
          }
          div++;
      }
      
      if(div * div > i){
          System.out.println(i);
      } 
    }
    
    
 scn.close();   
}
}