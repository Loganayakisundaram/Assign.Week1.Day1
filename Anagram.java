package week1.Day2Assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text ="stops";
		String text1="potss";
		
		if(text.length()==text1.length())
		{
			char[]text2=text.toCharArray();
			char[]text3=text1.toCharArray();
			
			Arrays.sort(text2);
			Arrays.sort(text3);
			
			if(Arrays.equals(text2, text3)==true)
			{
				System.out.println("the string is Anagram");
							}
			}else {
				System.out.println("the string is not Anagram");
			}

	}

}
