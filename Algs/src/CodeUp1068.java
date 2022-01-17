import java.util.Scanner;

public class CodeUp1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		
		if( grade >= 90)
			System.out.println("A");
		else if (grade >= 70)
			System.out.println("B");
		else if (grade >= 40)
			System.out.println("C");
		else 
			System.out.println("D");
			
	}
}
