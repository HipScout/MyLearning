public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arraySize = 10;
        int  array[] = {10, 20, 23, 34, 44, 44, 53, 56, 21, 99};
        int emptyArray[] = {};

        System.out.println(arraySearch(array,99));
        System.out.println(arraySearch(array,909));
        System.out.println(arraySearch(emptyArray,909));
        System.out.println(arraySearchWithValue(emptyArray,909));
        System.out.println(arraySearchWithValue(array,909));
        System.out.println(arraySearchWithValue(array,99));
        System.out.println(arraySearchWithValue(array,44));


    }


    static boolean arraySearch(int array[], int value ) {
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] == value) {
                return true;
            }
        }
        return false;
    }

    static int arraySearchWithValue(int array[], int value ) {
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] == value) {
                return idx;
            }
        }
        return -1;
    }
}