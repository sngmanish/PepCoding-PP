
import java.util.*;

public class Reverse_an_Array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){    //for printing all values in string a at once
      sb.append(val + " ");  // appending all values to sb
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
      int f= 0;
      int l = a.length -1;
      while (f<l){
         int temp = f;
         f= l ;
         l = temp;
         f++;
         l--;
      } 
    
  }

public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] =  scn.nextInt();
    }
    reverse(a);
    display(a);
    scn.close();
 }

}