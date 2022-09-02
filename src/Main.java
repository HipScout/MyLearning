import com.sun.org.apache.bcel.internal.generic.ALOAD;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arraySize = 10;
        int  array[] = {10, 20, 23, 34, 44, 44, 53, 56, 21, 99};
        int  sortedArray[] = {10, 20, 23, 34, 44, 44, 53, 56, 67, 99, 103};
        int  arrayOdd[] = {10, 20, 23, 34, 44, 53, 56, 21, 99};
        int emptyArray[] = {};
        int nums[] = {2, 4, 11, 15, 21};

        int target = 19;


        System.out.println(arraySearch(array,99));
        System.out.println(arraySearch(array,909));
        System.out.println(arraySearch(emptyArray,909));

        System.out.println(arraySearchWithValue(emptyArray,909));
        System.out.println(arraySearchWithValue(array,909));
        System.out.println(arraySearchWithValue(array,99));
        System.out.println(arraySearchWithValue(array,44));

        System.out.println(arrayToString(array));

        System.out.println(arrayToString(arraySearchAndReplace(array,44, 0)));

        System.out.println("Normal Array before reverse: " + arrayToString(array));
        System.out.println("Odd Array before reverse: " + arrayToString(arrayOdd));
        System.out.println("Empty Array before reverse: " + arrayToString(emptyArray));

        swap();

        reverseArray(array);
        reverseArray(arrayOdd);
        reverseArray(emptyArray);

        System.out.println("Normal Array after reverse: " + arrayToString(array));
        System.out.println("Odd Array after reverse: " + arrayToString(arrayOdd));
        System.out.println("Empty Array after reverse: " + arrayToString(emptyArray));

        System.out.println("Check for duplicate binary search" + Algorithms.binarySearch(sortedArray, 44));
        System.out.println("Check for non existence binary search" + Algorithms.binarySearch(sortedArray, 21));
        System.out.println("Check for left bound binary search" + Algorithms.binarySearch(sortedArray, 10));
        System.out.println("Check for right bound binary search" + Algorithms.binarySearch(sortedArray, 99));
        System.out.println("Check for  positive right bound binary search" + Algorithms.binarySearch(sortedArray, 500));
        System.out.println("Check for negative left bound binary search" + Algorithms.binarySearch(sortedArray, -99));

        System.out.println("Two sum " + TwoSum.bruteForceTwoSum(nums, 19));
        System.out.println("Two sum " + TwoSum.bruteForceTwoSum(nums, 501));
        System.out.println("Two sum " + TwoSum.bruteForceTwoSum(nums, 8));

        System.out.println("Two sum with binary search " + TwoSum.twoSumWithBinarySearch(nums, 8));
        System.out.println("Two sum with binary search " + TwoSum.twoSumWithBinarySearch(nums, 15));
        System.out.println("Two sum with binary search " + TwoSum.twoSumWithBinarySearch(nums, 500));

    }
    static void swap() {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    static void reverseArray(int array[]) {

        for(int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    static String arrayToString(int array[]) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for(int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
    static int[] arraySearchAndReplace(int array[] , int from, int to) {
        for(int idx = 0; idx < array.length; idx++) {
            if(array[idx] == from) {
                array[idx] = to;
            }
        }
        return array;
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