package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * exercicio 10, faça um programa que peça temperatura em celsius e passe para
		 * farenheit
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em c°: ");
		double c = scan.nextDouble();

		double f = (c * 1.8) + 32;

		System.out.println("A temperatura " + c + " C é igual a " + f + " F");
		scan.close();

	}

}
