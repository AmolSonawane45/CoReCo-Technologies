package com.amol.basic.reverseword;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Hello World";
        String reversed = reverseWords(original);
        System.out.println(reversed);
	}

	private static String reverseWords(String original) {
		// TODO Auto-generated method stub
		 String[] words = original.split(" ");
	        String reversed = "";
	        for (int i = words.length - 1; i >= 0; i--) 
	        {
	            reversed += words[i];
	            if (i != 0) 
	            {
	                reversed += " ";
	            }
	        }
	        char[] charArray = reversed.toCharArray();
			int start = 0;
			int end = reversed.length() - 1;
			
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
