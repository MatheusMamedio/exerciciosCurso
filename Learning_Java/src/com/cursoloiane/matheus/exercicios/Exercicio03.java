package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//exercicio 3, faça um programa que peça 2 numeros e imprima a soma
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("digite o segundo numero: ");
		int numero2 = scan.nextInt();
		scan.close();
		System.out.println("a soma entre "+numero1 + "+" + numero2 + "="+ (numero1 + numero2) );
	}

}
