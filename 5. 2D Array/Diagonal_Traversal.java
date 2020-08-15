
import java.util.*;
/**
 * Diagonal_Traversal
 */
public class Diagonal_Traversal {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        
        int [][]  arr = new int [n][n];
        // taking input 1st matrix  
        for (int i =0; i<n ;i++){
            for (int j =0; j<n ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        }

        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = i + g; j < arr.length; i++, j++){
               System.out.println(arr[i][j]);
            }
         }
        scn.close();
    }
}