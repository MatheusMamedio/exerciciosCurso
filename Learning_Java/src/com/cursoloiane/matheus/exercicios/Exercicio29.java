package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		/*
		 * Exercicio 29, faça um programa que leia tres lado de um triangulo, o programa
		 * devera informar se os valores podem ser um triangulo, indique, caso os lados
		 * formem um triangulo: equilatero, isosceles ou escaleno
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro lado: ");
		double lado1 = scan.nextDouble();

		System.out.println("Entre com o segundo lado: ");
		double lado2 = scan.nextDouble();

		System.out.println("Entre com o terceiro lado: ");
		double lado3 = scan.nextDouble();

		if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
			double soma = lado1 + lado2 + lado3;
			System.out.println("triangulo Equilátero, soma = " + soma);

		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			double soma = lado1 + lado2 + lado3;
			System.out.println("triangulo isósceles, soma = " + soma);

		} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			double soma = lado1 + lado2 + lado3;
			System.out.println("triangulo Escaleno, soma = " + soma);
		}else {
			System.out.println("isso não é um triangulo");
		}

	}

}
