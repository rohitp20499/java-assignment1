package RemainingProbs;

public class PrimeNumber {
public static void main(String[] args) {
	int num1 = 11;
	boolean flag = true;
	
	for(int i=2;i<num1;i++)
	{
		if(num1%i==0) 
		{
			flag = false;
			break; 
		}
	}
	
	if(flag == true)
	{
		System.out.println(num1+" is Prime Number");
	}
	else
	{
		System.out.println(num1+" is not a Prime Number");
	}
	
}
}
