import java.util.Arrays;
import java.util.Iterator;

//public class Q7 {
    public class MyArray<T> implements Iterable<T>{

        private T [] arr;

        public MyArray(T [] a){
            this.arr = Arrays.copyOf(a,a.length);
        }

        public static void main(String [] args){
            java.lang.Integer [] ar = {3,4,5};

            MyArray<Integer> n = new MyArray<Integer>(ar);

            for( Integer i: n){
                System.out.println(i);
            }

        }

        public class MyIterator implements Iterator<T> {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i<arr.length;
            }

            @Override
            public T next() {
                T temp = arr[i];
                i += 1;
                return temp;
            }
        }

        @Override
        public Iterator<T> iterator() {
            return new MyIterator();
        }
    }

