import java.util.Arrays;
import java.util.Random;

public class Q5 {

    static double[][] matProd(double[][] mat1, double[][] mat2) {
        double [][] prod = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    prod[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        return prod;
    }


    public static void main(String[] args) {

        int m = 2, n = 2;

        double mat1[][] = new double[m][n];
        double mat2[][] = new double[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = rand.nextInt(3);
                mat2[i][j] = rand.nextInt(5);
            }

        }
        double prod[][] = matProd(mat1, mat2);

        System.out.println("Matrix 1 :"+ Arrays.deepToString(mat1));
        System.out.println("Matrix 2 :"+Arrays.deepToString(mat2));
        System.out.println(Arrays.deepToString(prod));


    }
}

