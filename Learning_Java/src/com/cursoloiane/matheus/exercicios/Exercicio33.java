package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		/*
		 * exercicio 33, faça um programa que leia 2 numeros e em seguida pergunte ao
		 * usuario qual operação deseja realizar. O resultado da operação deve ser
		 * acompanhada de uma frase que diga se o numero é par ou impar, positivo ou
		 * negativo
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("entre com o primeiro numero");
		int num1 = scan.nextInt();

		System.out.println("entre com o segundo numero");
		int num2 = scan.nextInt();

		System.out.println("entre com a operação [+ - / *] ");
		String operacao = scan.next();

		boolean valida = true;
		double resultado = 0;

		switch (operacao) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operação invalida");
			valida = false;
		}

		if (valida) {
			System.out.println("resultado = " + resultado);

			if (resultado >= 0) {
				System.out.println("resultado positivo");
			} else {
				System.out.println("resultado negativo");
			}

		}
		if (resultado % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}

	}

}
