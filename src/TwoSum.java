import sun.swing.StringUIClientPropertyKey;

public class TwoSum {
    public static boolean bruteForceTwoSum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean twoSumWithBinarySearch(int sortedArray[], int target) {
        System.out.printf("target is %d%n", target);

        for (int i = 0; i < sortedArray.length; i++) {
            int firstValue = sortedArray[i];
            int secondValue = target - firstValue;
            System.out.printf("First value = %d Second Value = %d%n", firstValue, secondValue);
            int secondValueIndex = Algorithms.binarySearch(sortedArray, secondValue);
            System.out.printf("first idx %d second idx %d%n", i, secondValueIndex);


            if (secondValueIndex != -1 && secondValueIndex != i) {
                return true;
            }
        }

        return false;

    }
}
