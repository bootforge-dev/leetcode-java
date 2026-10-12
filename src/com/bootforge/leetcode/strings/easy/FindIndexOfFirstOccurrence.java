package com.bootforge.leetcode.strings.easy;

public class FindIndexOfFirstOccurrence {
    static void main(String[] args) {
        String haystack ="leetcode";
        String needle = "leeto";
        System.out.println(indexOfFirstOccurrence(haystack, needle));
    }

    private static int indexOfFirstOccurrence(String haystack, String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return  -1;
        }
    }
}
