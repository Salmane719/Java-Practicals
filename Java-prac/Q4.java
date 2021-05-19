import java.util.Arrays;
import java.util.Random;

public class Q4 {

    static int[][] addMatrices(int [][]mat1,int [][]mat2){
       int m = 2 , n= 2;
        int sum [][] = new int [m][n];
        for ( int i = 0 ;  i < m; i++){
            for ( int j = 0 ; j < n; j++){
                sum [i][j]= mat1[i][j]+mat2[i][j];
            }

        }


        return sum;
    }


    public static void main ( String [] args){
       int m = 2, n = 2 ;

       int mat1[][]=new int[m][n];
       int mat2[][]= new int [m][n];

        Random rnd = new Random();
        for ( int i = 0 ; i < m;i++){
            for ( int j = 0 ; j < n; j++){
                mat1[i][j]=rnd.nextInt(5);
                mat2[i][j]=rnd.nextInt(5);
            }
        }
       int sum [][] =addMatrices(mat1,mat2);
        System.out.println("matrix 1 :"+Arrays.deepToString(mat1));
        System.out.println("matrix 2 :"+Arrays.deepToString(mat2));
        System.out.println(Arrays.deepToString(sum));



    }
}

