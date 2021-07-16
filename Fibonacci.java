package Assignment;

public class Fibonacci {

	public static void main(String[] args) {

int range =8;
int firstNum=0;
int secNum=1;
int sum;


System.out.println("first Num is :"+firstNum);
for(int i=0;i<=8; i++)
{
sum=firstNum+secNum;
System.out.println("sum is:"+sum);
firstNum=secNum;
System.out.println("firstnum:"+firstNum);
secNum=sum;
System.out.println("sec num:"+secNum);

System.out.println("sum is :"+sum);
System.out.println("*************");
	}

}
}
