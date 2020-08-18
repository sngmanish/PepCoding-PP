
import java.util.*;
/**
 * Next_Greater_Element_to_Right
 */
public class Next_Greater_Element_to_Right {

  public static void display(int[] a){
    for(int i =0 ; i<a.length ;i++){
        System.out.println(a[i]);
    }
  }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] =  scn.nextInt();
    }
    int[] nge = solve(a);
    display(nge);
    scn.close();
 }

 public static int[] solve(int[] arr){
   
   int[] ans = new int[arr.length];
    Stack<Integer> st = new Stack<>();
    for(int i = arr.length - 1; i >= 0; i--){
      while(st.size() > 0 && arr[i] >= st.peek()){
        st.pop();
      }     
      if(st.size() > 0){
        ans[i] = st.peek();
      } else {
        ans[i] = -1;
      }
      st.push(arr[i]);
    }
    return ans;
    
 }

}