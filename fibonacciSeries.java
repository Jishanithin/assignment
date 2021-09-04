package dayone;

public class fibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
				int n;
				int i;

		System.out.println(firstNum);
		System.out.println(secondNum);
		for (i = 1; i <8; i++) 
		{

			n = firstNum + secondNum;
			System.out.println(n);
			firstNum = secondNum;
			secondNum = n;
		}
	}
}
