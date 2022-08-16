package ru.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> array = new ArrayList<>();

        for(int n1:nums1){
            map.put(n1,map.getOrDefault(n1, 0) + 1);
        }
        for(int n2:nums2){
            if(map.getOrDefault(n2, 0) !=0){
                array.add(n2);
                map.put(n2,map.getOrDefault(n2, 0) -1);
            }
        }
        int[] arr = new int[array.size()];
        int k = 0;
        for (int i : array) arr[k++] = i;
        return arr;
//return array.stream().mapToInt(i -> i).toArray();
    }
}
