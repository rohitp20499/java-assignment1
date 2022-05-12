package RemainingProbs;

public class FibonacciSeries {

	public static void main(String args[])
	{
		int i,j,k=0;
		
		i = 0;
		j = 1;
		System.out.print(i+"  ");
		System.out.print(j+"  ");
		for(;k<100;)
		{
		k= i+j;
		i = j;
		j = k;

		System.out.print(k+"  ");
		}
		
	}
	
}
