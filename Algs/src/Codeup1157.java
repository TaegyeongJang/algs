import java.util.Scanner;

public class Codeup1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double position = sc.nextDouble();
		
		if(position >= 50 && position <= 60)
			System.out.println("win");
		else
			System.out.println("lose");
	}
}
