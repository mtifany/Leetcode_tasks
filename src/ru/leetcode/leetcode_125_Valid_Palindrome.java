package ru.leetcode;

public class leetcode_125_Valid_Palindrome {

    public boolean isPalindrome(String s) {

        if(s==null || s.length() ==1)
            return true;
        s = s.toLowerCase();
        int start = 0, end = s.length() -1;
        while(start < end){
        if(!Character.isLetterOrDigit(s.charAt(start)))
            start++;
        else if (!Character.isLetterOrDigit(s.charAt(end)))
            end--;
          else  if(!(s.charAt(start++)==s.charAt(end--)))
                return false;
                 }
        return true;

    }


}
