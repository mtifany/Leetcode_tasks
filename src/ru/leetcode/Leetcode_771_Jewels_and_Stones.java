package ru.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
    int res = 0;
        for(int i = 0; i < stones.length(); i++){
        for(int j = 0; j < jewels.length(); j++){
            if (jewels.charAt(j) == stones.charAt(i))
            {res ++;
                break;}
        }
    }
        return res;
    }
}
