public class Algorithms {

    public static int binarySearch(int array[], int key) {
        int lo = 0;
        int hi = array.length -1 ;


        while(lo < hi) {
            int mid = (lo + hi)/2;
            if(array[mid] == key){
                return mid;
            } else if (array[mid] < key) {
                lo = mid + 1;

            }
            else {
                hi = mid;
            }
        }
        return -1;


    }
}
