package RemainingProbs;

public class IncrementCount {

	int count=0;
	public static void main(String[] args) {

		IncrementCount ic = new IncrementCount();
		int total = ic.incrementCount(ic.count);
		System.out.println(total);
	}
	public int incrementCount(int count) {
		count++;
		return count;
	}

}
