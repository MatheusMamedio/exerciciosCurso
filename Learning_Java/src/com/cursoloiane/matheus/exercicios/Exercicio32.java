package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		/*
		 * exercicio 32, faça um programa que peça um numero inteiro e determine se ele
		 * é par ou impar
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o ano: ");
		int num= scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("é par");
			
		}else {
			System.out.println("é impar");
		}
		scan.close();
	}

}
