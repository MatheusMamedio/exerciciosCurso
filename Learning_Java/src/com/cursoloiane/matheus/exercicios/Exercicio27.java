package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		/*exercicio 27, faça um programa que leia um numero
		 *numero e exiba o dia correspondente da semana (1-Domingo 2-Segunda, etc)
		 *se digitar outro valor deve aparecer invalido.*/
		
		Scanner scan = new Scanner(System.in);

		int diaSemana = scan.nextInt();
		System.out.println("Entre com um dia da semana [1-7] ");

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("terça");
			break;
		case 4:
			System.out.println("quarta");
			break;
		case 5:
			System.out.println("quinta");
			break;
		case 6:
			System.out.println("sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;

		default:
			System.out.println("não é um dia da semana valido");
			break;
		}

		scan.close();	
	}

}
