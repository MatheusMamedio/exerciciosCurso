package exercicio01.ifs;

import java.util.Scanner;

public class ExercicioIfs {

	public static void main(String[] args) {
		// exercicio1
				Scanner scan = new Scanner(System.in);
				int hora;

				System.out.println("digite a hora");
				hora = scan.nextInt();
				if (hora < 12) {
					System.out.println("bom dia!");
				} else if (hora > 12 && hora < 18) {
					System.out.println("boa tarde");
				} else if (hora > 18) {
					System.out.println("boa noite");
				}
				scan.close();
	}

}
