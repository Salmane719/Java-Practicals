public class Q2 {


     static int getIndex(int[] arr, int x){
         int index = 0;

         for (int i = 0 ; i < arr.length;i++){
             if ( arr[i]== x )
             {
                 index = i ;
             }
         }
         return index ;
     }
    public static void main ( String [] args){

        int [] arr = { 90 , 77 , 67 , 55, 75 , 57 , 98 , 17 , 50 ,23 , 30 , 100,
34 , 75 , 28 , 43, 14 , 52, 64 , 13 };

int x = 64  ;

int indexof = getIndex(arr, x);

System.out.println("index of "+x + ":"+indexof);

    }
}
