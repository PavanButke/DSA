package TwoDArrays;

import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String []args)
	{
    Scanner scan= new Scanner(System.in);
        int nr1=scan.nextInt();
        int nc1=scan. nextInt();
        
        int mat1[][]=new int[nr1][nc1];
        for(int i=0 ; i< nr1 ;i++){
            for(int j=0 ; j<nc1 ;j++){
                mat1[i][j]=scan.nextInt();
            }
        }
        int nr2=scan.nextInt();
        int nc2=scan.nextInt();
        
        int mat2[][]=new int[nr2][nc2];
        for(int i=0 ; i< nr2 ;i++){
            for(int j=0 ; j<nc2 ;j++){
                mat2[i][j]=scan.nextInt();
            }
        }
        if(nc1==nr2){
        int mat3[][]= new int [nr1][nc2];
      
        for(int i=0 ; i<mat3.length ; i++){
            for(int j=0 ; j<mat3[0].length ; j++){
                for(int idx=0; idx< nc1 ;idx++ ){
                      mat3[i][j]=mat3[i][j]+(mat1[i][idx]*mat2[idx][j]);
                }
                }
               
            }
            for(int i=0 ; i<mat3.length ; i++){
            for(int j=0 ; j<mat3[0].length ; j++){
                 System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
        
        }
        else{
            System.out.print("Invalid input"); 
        }
}

}
