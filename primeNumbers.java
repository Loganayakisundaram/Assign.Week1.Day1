package Assignment;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=11;
		int count=0;
		int cal=s/2;
		boolean flag =false;
		
		
		for(int i=2;i<=s;i++)
		{
			if(s%i==0)
				
				count=count+1;
		}
					
		if (count >0)
		{
			System.out.println("prime");
		} else {
			count++;
			System.out.println("not prime");
		}
	
	}
}


