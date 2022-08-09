package ru.leetcode;

import java.util.Arrays;

public class Leetcode_268_Missing_Number {

    class Solution {
        public int missingNumber(int[] nums) {

          int  len= nums.length;
            if (nums.length == 0)
            return 0;
        int sum = 0;
            for (int num : nums) {
                sum += num;
            }
        return sum - (len*(len+1))/2;

        }
    }
}
