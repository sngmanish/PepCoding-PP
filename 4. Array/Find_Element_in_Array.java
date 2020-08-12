import java.util.*;
/**
 * Find_element_in_Array
 */
public class Find_Element_in_Array {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<arr.length ;i++){
            arr[i] = scn.nextInt();    
        }
        int index=-1;
        for (int i =0; i<arr.length ;i++){
           if (d== arr[i]){
            index=i;
            break;
           }
         
        System.out.print(index);
    }
        
        
        scn.close();

    }
}