package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/* Exercicio 12, tendo como dadosde entrada a altura de uma pessoa
		 * construa um algoritmo que calcule seu peso ideal usando a seguinte formula:
		 * (72.7 * altura)-58
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("o peso ideal é: "+ pesoIdeal);
		
	
		
		
	}

}
