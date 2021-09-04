package dayone;

public class primeNumber {

	public static void main(String[] args) {
		int i;
		int count = 0;
		int n = 13;
		for (i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(n + " is a prime number");
		}

		else {

			System.out.println(n + "is not a prime number");
		}
	}
}
