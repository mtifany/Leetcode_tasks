package ru.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_228_SummaryRanges {

    public static void main(String[] args) {
    int[] nums = {0,1,2,4,5,7};

        System.out.println(summaryRanges(nums));
    }
    static List<String> summaryRanges(int[] nums) {
        int flag = 0;
        int i = 0;
        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        if (nums.length == 0)
            return result;

        for(i = 0;i< nums.length -1; i++){
            if (nums[i+1] - nums[i] ==1){
              if (flag == 0){
                  str.append(nums[i]).append("->");
            flag = 1;
              continue;
              }
              else
                continue;
            }else
              //  if (flag != 0)
                    str.append(nums[i]);
                result.add(str.toString());
                str = new StringBuilder();
                flag = 0;
        }
        if (nums[nums.length-1]-nums[nums.length-2] == 1){
            result.add(str.append(nums[nums.length-1]).toString());
        }
        else result.add(str.append(nums[nums.length-1]).toString());




    return result;}
}

//    static List<String> summaryRanges(int[] nums) {
//
//        List<String> result = new ArrayList<>();
//        if (nums.length == 0)
//            return result;
//
//        for(int i = 0;i< nums.length; i++) {
//            int start = nums[i];
//            while(i + 1 < nums.length && nums[i] +1 == nums[i+1]){
//                i++;
//            }
//            if (start == nums[i]){
//                result.add(""+start);
//            }
//            else result.add(""+start+"->"+nums[i]);
//        }
//        return result;}
//}