package exercicio04.ifs;

import java.util.Scanner;

public class ExercicioIfs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade;
		boolean visto;

		System.out.print("digite sua idade");
		idade = scan.nextInt();
		System.out.print("você possui visto?");
		visto = scan.nextBoolean();
		if (idade <= 18 && visto == true) {
			System.out.print("você pode viajar pros EUA");
		} else {
			System.out.print("você nao pode ir pros EUA");
		}
		scan.close();
	}

}
