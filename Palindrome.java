package week1.Day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		 String value = "loganayaki";
				 String rev ="";
				 String[] split = value.split("");
				 // using for loop 
				 for(int i=0; i<split.length;i++)
				 {
					  rev=split[i];
					 
				 }
				 
				 System.out.println(rev);
				 
				 if(rev.equalsIgnoreCase(value)==true)
				 {
					 System.out.println("the string is palindrome :" +value);
				 }
				 else
				 {
					 System.out.println("the string is not palindrome:" +value);
				 }
	}

}
