package week1.Day2Assignment;

public class findTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$";
		int letter =0, space =0,num=0,specialChar=0;
		
		char[] testChar = test.toCharArray();
		
		for (int i=0;i<testChar.length;i++) {
			if(Character.isLetter(testChar[i])==true)
			{
				letter=letter+1;
			}else if (Character.isDigit(testChar[i])==true)
			{
				num=num+1;
			}else if(Character.isSpaceChar(testChar[i])==true)
			{
				space=space+1;
			}
			else 
			{
				specialChar=specialChar+1;
			}
		}
		System.out.println(letter+":Letter");
		System.out.println("*****");
		System.out.println(space+ ":Space");
		System.out.println("*****");
		System.out.println(num +":Number");
		System.out.println("*****");
		System.out.println(specialChar+":SpecialCharacter");
		System.out.println("*****");

	}

}
