package com.matheus.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// exercicio01 sobre Do...While

		Scanner scan = new Scanner(System.in);
		int opc;
		do {
			System.out.println("=====MENU=====");
			System.out.println("1. Nome do usuario");
			System.out.println("2. idade ");
			System.out.println("2. Sair do Sistema");
			opc = scan.nextInt();
			if (opc == 1)
				System.out.println("Jonnny");
			else if (opc == 2)
				System.out.println("idade 23");
			else if (opc != 3)
				System.out.println("opção invalida");
		} while (opc != 3);
		scan.close();

	}

}
