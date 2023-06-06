package com.matheus.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*exercicio02 sobre IF
		Maior numero entre 3 numeros*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com 3 numeros");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " é o maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " é o maior");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println(num3 + " é o maior");
		} else {
			System.out.println("os numeros são iguais");
		}
		scan.close();

	}

}
