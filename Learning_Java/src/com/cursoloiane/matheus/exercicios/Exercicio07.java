package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * exercicio 7, faça um programa que calcule a area de um quadrado, em seguida
		 * mostre o dobro desta area pro usuario
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamnho do lado do quadrado: ");
		double lado = scan.nextDouble();

		double area = Math.pow(lado, 2);

		System.out.println("A area do quadrado é: " + area);
		System.out.println("o dobro da area do quadrado é: " + (area * 2));
		scan.close();
	}

}
