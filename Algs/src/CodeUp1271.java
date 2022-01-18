import java.util.Scanner;

public class CodeUp1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int max = Integer.MIN_VALUE; // 문제 조건에 0이상이라고 나와 있어서 0 수정
		
		for (int i = 0; i < count ; i++) {
			int num = sc.nextInt();
			
			max = (max > num) ? max : num;
		}
		System.out.println(max);
	}
}
