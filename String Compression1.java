// String Compression
// Easy

// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

// Constraints
// 1 <= length of string <= 1000

// Format
// Input
// A String

// Output
// Two strings representing first compressed string and second compressed string respectively.

// Example
// Sample Input

// wwwwaaadexxxxxx

// Sample Output
// wadex
// w4a3dex6

import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		String s=str.charAt(0)+"";

		for(int i=1;i<str.length();i++){
			char curr=str.charAt(i);
			char prev = str.charAt(i-1);

			if (curr != prev) {
				s +=curr;
				
			} 

		}
		return s;
	}

	public static String compression2(String str){
		String s=str.charAt(0)+"";
             int count=1;
		for(int i=1;i<str.length();i++){
			char curr=str.charAt(i);
			char prev = str.charAt(i-1);

			if (curr == prev) {
				count++;
				
			} else{
				if(count >1){
					s +=count;
					count =1;
				}
				     s +=curr;
			}
        
		}
		if(count >1){
					s +=count;
					count =1;
				}
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
