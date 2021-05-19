import java.util.Arrays;

public class Q3 {

    static String[] getCommonElements(String[] array1 , String [] array2 ){

        String [] store = null ;

        for ( int i = 0 ; i < array1.length; i++){
            for ( int j = 0 ; j < array2.length; j++){
                if ( array1[i] == array2[j]){
                    store = array1;
                }
            }
        }


        return store ;
    }

    public static void main ( String [] args) {

        String[] array1 = {"nail", "cure", "vagabond", "riddle", "act", "songs ", "zipper", "excite", "magical",
                "eager", "blood", "coast", "guess", "selfish", "milky", "ticket", "authority"};
        String[] array2 = {"cure", "wicked", "guess", "vagabond", "riddle",
                "act", "excite", "songs", "troubled", "eager", "blood", "coast", " waiting",
                "selfish", "milky", "ticket", "authority", "nail"};

        String[] common = getCommonElements(array1 , array2); //your code

        System.out.println(Arrays.asList(common));
    }

}
