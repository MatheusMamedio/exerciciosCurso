package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/* Exercicio 15, faça um programa que peça dois numeros
		 * e imprima o maior deles
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		int num1= scan.nextInt();
		
		System.out.println("Entre com o segundo numero:");
		int num2= scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("o numero "+num1+" é maior");
		}else System.out.println("o numero "+num2+" é maior");
	}

}
