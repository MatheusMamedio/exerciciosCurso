package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// exercico 4, faça um programa que peça 4 numeros bimestrais e mostre a média
		Scanner scan = new Scanner(System.in);

		System.out.println("entre com a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("entre com a segunda nota: ");
		double nota2 = scan.nextDouble();

		System.out.println("entre com a terceira nota: ");
		double nota3 = scan.nextDouble();

		System.out.println("entre com a quarta nota: ");
		double nota4 = scan.nextDouble();

		double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("a media entre os quatro valores é: " + resultado);

	}

}
