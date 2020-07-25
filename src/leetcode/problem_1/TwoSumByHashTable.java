package leetcode.problem_1;

import java.util.HashMap;
import java.util.Map;

/*To improve our run time complexity, we need a more efficient way to check if the complement exists in the array.
If the complement exists, we need to look up its index. What is the best way to maintain a mapping of
each element in the array to its index? A hash table.
We reduce the look up time from O(n)O(n) to O(1)O(1) by trading space for speed. A hash table is built exactly
for this purpose, it supports fast look up in near constant time. I say "near" because if a collision occurred,
a look up could degenerate to O(n)O(n) time. But look up in hash table should be amortized O(1)O(1) time as long
as the hash function was chosen carefully.
A simple implementation uses two iterations. In the first iteration, we add each element's value and its index
to the table. Then, in the second iteration we check if each element's complement (target - nums[i]target−nums[i])
exists in the table. Beware that the complement must not be nums[i]nums[i] itself!

*/
public class TwoSumByHashTable {

    public int[] twoSum(int[] nums, int targetValue) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        //   map.forEach((k, v) -> System.out.println("Key " + k + "value " + v));
        for (int i = 0; i < nums.length; i++) {
            Integer complement = targetValue - nums[i];
            if (map.containsKey(complement) ) {
                return new int[]{map.get(complement), i};
            }
        }
        throw new IllegalArgumentException("Not Available in the array");
    }

    public static void main(String[] args) {
        int[] indice = new TwoSumByHashTable().twoSum(new int[]{1, 2, 3, 4, 5}, 6);
        for (int i = 0; i < indice.length; i++) {
            System.out.println("Indice" + indice[i]);
        }
    }
}
