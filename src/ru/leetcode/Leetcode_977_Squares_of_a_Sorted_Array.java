package ru.leetcode;

import java.util.Arrays;

public class Leetcode_977_Squares_of_a_Sorted_Array {
public int[] sortedSquares(int[] nums){
        return Arrays.stream(nums).map(a -> a * a).sorted().toArray();

}

}
