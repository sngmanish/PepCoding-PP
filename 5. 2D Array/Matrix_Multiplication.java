import java.util.*;
/**
 * Matrix_Multiplication
 */
public class Matrix_Multiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n1 =scn.nextInt();
        int m1 =scn.nextInt();
        int [][]  arr1 = new int [n1][m1];
        // taking input 1st matrix  
        for (int i =0; i<n1 ;i++){
            for (int j =0; j<m1 ;j++){
              arr1[i][j] = scn.nextInt();  
            }   
        }

        int n2 =scn.nextInt();
        int m2 =scn.nextInt();
        int [][]  arr2 = new int [n2][m2];
        // taking input 2nd matrix  
        for (int i =0; i<n2 ;i++){
            for (int j =0; j<m2 ;j++){
              arr2[i][j] = scn.nextInt();  
            }   
        }

        if (m1 != n1){
            System.out.print("Invalid Output");
        }

        // multiplying 
       int [][]  mult = new int [n1][m2];

        for (int i =0; i<m1 ;i++){
            for (int j =0; j<n2 ;j++){
                for (int k =0; k<m1 ;k++){
                 mult[i][j] += arr1[i][k] * arr2[k][j]; // try multiplying manually  you'll find this pattern.
                }
            }   
        }  

        // printing output  
        for (int i =0; i<n1 ;i++){
            for (int j =0; j<m2 ;j++){
              System.out.print(mult[i][j]);
            }   
            System.out.println();

        } 
        scn.close();    
      }  
 }

