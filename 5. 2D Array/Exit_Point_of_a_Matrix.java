
import java.util.*;
/**
 * Exit_Point_of_a_Matrix
 */
public class Exit_Point_of_a_Matrix {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        int [][]  arr = new int [n][m];
        // taking input 
        for (int i =0; i<n ;i++){
            for (int j =0; j<m ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        }
        int i = 0;
        int j = 0;
        int dir = 0; //0 for east 1 for south 2 for west and 3 for north

        while (true) {
            dir = (dir + arr[i][j]) % 4; // whenever 1 is sencountered direction changes
            if (dir == 0) {
               j++;
            } else if (dir == 1) {
               i++;
            } else if (dir == 2) {
               j--;
            } else if (dir == 3) {
               i--;
            }
   
            if (i < 0) {
               i++; //to bring back to the exit point 
               break;
            } else if (j < 0) {
               j++;
               break;
            } else if (i == n) {
               i--;
               break;
            } else if (j == m) {
               j--;
               break;
            }
         }
         System.out.println(i);
         System.out.println(j);

        scn.close();
    }
}