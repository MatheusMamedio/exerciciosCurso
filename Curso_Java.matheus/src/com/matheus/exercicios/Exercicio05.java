package com.matheus.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Exercicio01 sobre While
		
		Scanner scan = new Scanner(System.in);

		int numeroMagico = 9;
		int chute;
		boolean jogando = true;

		while (jogando) {

			System.out.print("Digite um numero (1 a 30):");
			chute = scan.nextInt();

			if (chute == numeroMagico) {
				jogando = false;
				System.out.print("voce acertou");
			}
			scan.close();

		}
	}

}
