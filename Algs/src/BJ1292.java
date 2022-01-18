import java.util.Scanner;

public class BJ1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 5
		int b = sc.nextInt();

		int tmpA = a;
		int tmpB = b;

		int numA = 0;
		int numB = 0;
		int countA = 0;
		int countB = 0;
		int sumtilA = 0;
		int sumtilB = 0;

		for (int i = 1; i < a; i++) {
			if ((tmpA - i) <= 0) {
				numA = i;// f f
				break;
			}
			tmpA = tmpA - i; // 4 2
			countA += i; // 1 3
		}
		for (int i = 1; i < b; i++) {
			if ((tmpB - i) <= 0) {
				numB = i;
				break;
			}
			tmpB = tmpB - i;
			countB += i;
		}

		// B
		for (int i = 1; i < numB; i++) {
			sumtilB = sumtilB + i * i;
		}
		int ansB = (b == 1) ? 1 : (b - countB) * numB + sumtilB;
		ansB = (b == 2) ? 2 : ansB;

		// A
		for (int i = 1; i < numA; i++) {
			sumtilA = sumtilA + i * i;
		}

		int ansA = (a == 1) ? 0 : ((a - countA - 1) * numA + sumtilA);
		ansA = (a == 2) ? 1 : ansA;


		System.out.println(ansB-ansA);
	}
}
