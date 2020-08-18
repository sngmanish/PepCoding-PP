import java.util.*;
/**
 * Dublicate_Brackets
 */

public class Dublicate_Brackets {
    public static void main(String[] args)  {
      Scanner scn = new Scanner (System.in);
      String str = scn.nextLine();  //taking input of string, more later on string
      System.out.print(isDup(str));

      scn.close();
}
     public static boolean isDup(String str) {
     
     Stack<Character> st = new Stack<>(); // stack of characters
      for(int i = 0; i<str.length() ;i++ ){
          char ch = str.charAt(i);
          if (ch == ')'){   // when first closing bracket is encountered
              if(st.peek() =='('){ 
                 return true ;  
              }
               else {
                   while (st.peek() != '(')
                   st.pop();
               }
               st.pop();
              
          }
          
          else{
              st.push(ch);
          }
      }
      return false;
    }

}