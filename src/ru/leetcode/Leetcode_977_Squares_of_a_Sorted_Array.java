package ru.leetcode;

import java.util.Arrays;

public class Leetcode_977_Squares_of_a_Sorted_Array {
        public int[] sortedSquares(int[] A) {
                int n = A.length;
                int[] result = new int[n];
                int i = 0, j = n -1;
                for(int p = n -1; p>= 0; p--){
                        if(Math.abs(A[j]) > Math.abs(A[i])) {
                                result[p] = A[j] * A[j];
                        j--;
                        }
                        else{
                                result[p] = A[i] * A[i];
                                i++;
                        }
                }
                return result;
        }

}
