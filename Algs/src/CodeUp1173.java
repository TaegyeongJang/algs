import java.util.Scanner;

public class CodeUp1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hrA =  sc.nextInt();
		int minA = sc.nextInt();
		
		if (minA >= 30)
			minA -= 30;
		else {
			minA += 30;
			if(hrA == 0) {
				hrA = 23;
			} else
			hrA -= 1;
		}
		
		System.out.printf("%d %d", hrA, minA);
	}
}
