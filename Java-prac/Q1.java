
public class Q1 {

    public static void main(String[] args) {

        int [] my_array = { 25, 14 , 56 , 15 , 36, 56  , 77 , 18 , 29 , 49};

        int store =0 ;

        for ( int i = 0 ; i < my_array.length ; i++)
        {
            store = store + my_array[i];
        }

        double average = (double)store / my_array.length;


        System.out.println(average);
    }
}











