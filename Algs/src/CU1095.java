import java.util.Scanner;

public class CU1095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = 23;
		
		for(int i = 0; i < n ; i++) {
			int num = sc.nextInt();
			min = (min > num) ? num : min;
		}
		System.out.println(min);
	}

}
