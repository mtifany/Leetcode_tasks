package ru.leetcode;

public class Leetcode_4_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);
        int  posX, posY,
                len1 = nums1.length, len2= nums2.length,start = 0, end = len1,
                maxLeftX, maxLeftY, minRightX, minRightY;

        while(start<= end) {

            posX = (start+end)/2;
            posY = (nums1.length + nums2.length + 1) / 2 - posX;
            maxLeftX = (posX == 0) ? Integer.MIN_VALUE : nums1[posX -1];
            maxLeftY = (posY == 0) ? Integer.MIN_VALUE : nums2[posY -1];
            minRightX = (posX == len1) ? Integer.MAX_VALUE : nums1[posX];
            minRightY = (posY == len2) ? Integer.MAX_VALUE : nums2[posY] ;

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){

                if((len1 +len2) %2 == 0)
                    return ((double) (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX,minRightY)) / 2);
                else
                    return  Math.max(maxLeftX, maxLeftY);
            }
            if (maxLeftX > minRightY)
                end = posX - 1;
            else
                start = posX + 1;
        }
        return -1;
    }
}

