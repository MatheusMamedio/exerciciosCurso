package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * exercicio 9, faça um programa que peça a temperatura em graus Farenheit,
		 * transoforme e mostre a temperatura em graus celsius C=(5*(F-32)/9
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a temperatura em F°: ");
		double f = scan.nextDouble();

		double c = (5 * (f - 32) / 9);

		System.out.println("A temperatura " + f + " F é igual a " + c + " C");
		scan.close();

	}

}
