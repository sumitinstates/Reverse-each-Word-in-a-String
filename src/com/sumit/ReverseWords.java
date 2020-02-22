package com.sumit;

import java.util.Arrays;

public class ReverseWords {
	
	static String s = "sumit is kind";
	
	
	public static void main(String[] args) {
		
		System.out.println(s);
		String[] split = s.split(" ");
		String reverseString = "";  
		
		for(int i =0; i<split.length; i++) 
		{   
			//logic to reverse word 
			String temp = split[i];
			char[] charArray = temp.toCharArray();	
			char[] c = new char[charArray.length];
			
			for(int j = 0 ; j<charArray.length;j++) 
			{
				c[charArray.length-j-1]=charArray[j];
			}
			reverseString = reverseString + String.valueOf(c) + " ";
		}
		System.out.println("Final Reverse string is :"+ reverseString);
	}

}
