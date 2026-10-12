package com.bootforge.leetcode.strings.easy;

public class FindLengthOfLastWord {
    static void main(String[] args) {
        String[] inputs = {
                "Hello World",
                "   fly me   to   the moon  ",
                "luffy is still joyboy"
        };
        for(String input : inputs){
            System.out.println(input+" -> length of last word: "+findLengthOfLastWord(input));
        }
    }

    private static int findLengthOfLastWord(String str){
        String[] words = str.split("\\s+");
        return words[words.length-1].trim().length();
    }
}
