package Assignment;

public class Armstrong {

	public static void main(String[] args) {
		
int num =153;
int cal=0;
int remainder;
int quotient;

int original =num;

while (original>0)
{

	
	remainder =original%10; // remainder =153%10 3
	System.out.println("remainder is:"+remainder);
	original=original/10; // original =153/10 15
	System.out.println("original is :"+original);
	cal=cal+remainder*remainder*remainder; //cal =0+3*3*3 cal=27
	System.out.println("calculate is:" +cal);
	
}
if (num==cal)
{
	System.out.println("armstrong no");
}
else
{
	System.out.println("not armstrong no");
}

}
}
	


