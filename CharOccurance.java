package week1.Day2Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str= "welcome to chennai";
		
		int sum=0;
		
		System.out.println("string is :"+str);
		
		char[]strChar=str.toCharArray();
		for (int j=0;j<strChar.length;j++)
		{
			if(strChar[j]=='e')
			{
				sum=sum+1;
			}
		}
	
		System.out.println("character 'e' occurance in :"+sum);
		
	}
	
	
	
	
	}


