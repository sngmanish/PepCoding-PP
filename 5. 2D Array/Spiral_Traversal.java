import java.util.*;
/**
 * Spiral_Traversal
 */
public class Spiral_Traversal {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n =scn.nextInt();
        int m =scn.nextInt();
        int [][]  arr = new int [n][m];
        // taking input 1st matrix  
        for (int i =0; i<n ;i++){
            for (int j =0; j<m ;j++){
              arr[i][j] = scn.nextInt();  
            }   
        
        }
      int count = 0;
      int totalelements  = n * m;
      int minrow = 0;
      int mincol = 0;
      int maxrow = n - 1;
      int maxcol = m - 1;
      while(count < totalelements){
          //left wall
         for(int i = minrow; i <= maxrow && count < totalelements; i++){
            System.out.println(arr[i][mincol]);
            count++;
         }
         mincol++;
        //  bottom wall 
         for(int j = mincol; j <= maxcol && count < totalelements; j++){
            System.out.println(arr[maxrow][j]);
            count++;
         }
         maxrow--;
        //  right wall 
         for(int i = maxrow; i >= minrow && count < totalelements; i--){
            System.out.println(arr[i][maxcol]);
            count++;
         }
         maxcol--;
        //  top wall 
         for(int j = maxcol; j >= mincol && count < totalelements; j--){
            System.out.println(arr[minrow][j]);
            count++;
         }
         minrow++;

      }
        scn.close();
    }
}