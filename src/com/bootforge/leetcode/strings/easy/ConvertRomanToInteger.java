package com.bootforge.leetcode.strings.easy;

public class ConvertRomanToInteger {
    static void main(String[] args) {
        String[] inputs = {"III","LVIII","MCMXCIV"};
        for(String input: inputs){
            System.out.println(input+" -> "+convertRomanToInteger(input));
        }
    }

    private static int convertRomanToInteger(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            int current = values(str.charAt(i));
            if(i+1 < str.length()){
                int next = values(str.charAt(i+1));
                if(current < next){
                    count -= current;
                }else{
                    count += current;
                }
            }else{
                count += current;
            }
        }
        return count;
    }

    private static int values(char ch){
        return switch (ch){
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
