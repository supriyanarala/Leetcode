package com.array_strings;

import java.util.Arrays;

/*
You are given two strings word1 and word2.
Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:
 */
public class Solution {
    public static String MergeAlternately(String word1, String word2)
    {
        int i=0,j=0;
      StringBuilder finalWord = new StringBuilder();

       while(i < word1.length() || j<word2.length()) {
           if(i< word1.length()){
               finalWord.append(word1.charAt(i));
               i++;
           }
           if(j< word2.length()){
               finalWord.append(word2.charAt(j));
               j++;
           }
       }
        System.out.println("Output: " + finalWord.toString());
        return finalWord.toString();

    }
    public static void main(String []args){
       String combo1 =  MergeAlternately("abc","pqrs");
       String combo2 = MergeAlternately("ab","pqrs");
       String combo3 = MergeAlternately("abcd","pq");

        System.out.println("Output:combo1 " + combo1);
        System.out.println("Output: combo2" + combo2);
        System.out.println("Output: combo3" + combo3);
    }
}