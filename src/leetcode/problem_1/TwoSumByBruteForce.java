package leetcode.problem_1;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]*/
public class TwoSumByBruteForce {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("There is no two value is can be sum of the Target");
    }

    public static void main(String[] args) {
        int numbers[] = {3, 9, 5, 6};
        // ArrayList<Integer> val = new ArrayList<>(Arrays.asList(12, 4, 8));
        int[] returnValue = new TwoSumByBruteForce().twoSum(numbers, 12);
        System.out.println("Return values" + returnValue.toString());
        for (int k= 0; k< returnValue.length; k++){
            System.out.println(returnValue[k]);
        }
    }
}
