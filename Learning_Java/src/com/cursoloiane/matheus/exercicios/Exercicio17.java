package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		/*
		 * exercicio 13, Faça um programa que verifique se uma letra digitada é "F" ou
		 * "M" conforme a letra escrever: F- Feminino, M- Masculino
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra [F/M]");
		String input = scan.next();

		if (input.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo invalida");
		}

		scan.close();

	}

}
