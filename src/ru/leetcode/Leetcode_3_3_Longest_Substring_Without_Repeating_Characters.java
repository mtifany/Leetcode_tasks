package ru.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_3_3_Longest_Substring_Without_Repeating_Characters {

        public int lengthOfLongestSubstring(String s) {
            if (s.length()==0) return 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int max=0;

            for(int i = 0, j = 0; i< s.length(); i++){
                if (map.containsKey(s.charAt(i)))
                  j =  Math.max(j,map.get(s.charAt(i))+1);
                map.put(s.charAt(i), i);
                max = Math.max(max, i - j +1);
            }
            return max;
        }
    }


