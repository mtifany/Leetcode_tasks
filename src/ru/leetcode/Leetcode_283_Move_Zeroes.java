package ru.leetcode;

import java.util.Arrays;

public class Leetcode_283_Move_Zeroes {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            int j = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            for(int i = j;i<len;i++){
            nums[i] = 0;
            }
        }

    }
}




