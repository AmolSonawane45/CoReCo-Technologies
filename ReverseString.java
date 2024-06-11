package com.amol.basic.reversestring;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original = "Hello World";
	     String reverse = reverseString(original);
	     System.out.println(reverse);
	}

	private static String reverseString(String original) {
		// TODO Auto-generated method stub
		char[] charArray = original.toCharArray();
		int start = 0;
		int end = original.length() - 1;
		
		while(start < end)
		{
			char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
		}
		return new String(charArray);
	}
}
