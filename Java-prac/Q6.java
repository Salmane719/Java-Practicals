import javax.swing.text.html.parser.Element;
import java.util.Arrays;

public class Q6 {

    static int[][] gettriple(int[] arr, int target) {
int [][] Element = new int [70][3];
        int addCount = 0 ;
        for (int i = 0 ; i < arr.length ; i++ ){
            for ( int j = 0 ; j < arr.length ; j++){
                for ( int k = 0 ; k < arr.length; k++){
                    if ( i != j && j != k && i != k
                            &&(arr[i]+arr[j]+arr[k]== target)){
                        Element[addCount][0]= arr[i];
                        Element[addCount][1]= arr[j];
                        Element[addCount][2]= arr[k];
                        addCount++;

                    }
                }
            }
        }
        int [][] store = new int [addCount][3];
        for ( int i = 0  ; i < addCount ; i++){
            store[i][0]= Element[i][0];
            store[i][1]=Element[i][0];
            store[i][2]=Element[i][2];
        }
        return store ;
    }
    public static void main ( String [] args) {
        int arr[] = {-1, 12, 4, 7, 3, 2, 1, 2, 0, 1, 5};

        int x = 5;
        int target = 2;
        int[][] ans = gettriple(arr, target);
        System.out.println(Arrays.deepToString(ans));

    }

}
