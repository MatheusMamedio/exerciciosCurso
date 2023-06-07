package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * exercicio 11, faça um programa que peça 2 numeros inteiros e um numero real
		 * calcule e mostre: 
		 * a: o produto do dobro do primeiro com metade do segundo. 
		 * b: a soma do triplo do primeiro com o terceiro. 
		 * c: o terceiro elevado ao cubo.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Entre com outro numero inteiro: ");
		int num2 = scan.nextInt();
		System.out.println("Entre com um numero real: ");
		double num3 = scan.nextDouble();
		
		int resultadoA = (num1 * 2) * (num2/2);
		double resultadoB = (num1 * 3) + num3;
		double resultadoC = Math.pow(num3, 3);
		
		System.out.println("Resultado A: " + resultadoA);
		System.out.println("Resultado B: " + resultadoB);
		System.out.println("Resultado C: " + resultadoC);
	
	}

}
