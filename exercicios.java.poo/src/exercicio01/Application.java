package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		char resp;

		do {
		System.out.println("============================================");
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		System.out.printf("AREA = %.2f\n", rectangle.area());
		System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());
		System.out.println("want to try again? [Y/N]");
		resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}

}
