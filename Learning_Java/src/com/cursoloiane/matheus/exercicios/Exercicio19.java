package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*
		 * exercicio 19, faça um programa para leitura de duas notas parciais de um
		 * aluno, o programa deve calcular a media alcançada pelo aluno e apresentar a
		 * mensagem
		 * "aprovado se a nota for maior ou igual a sete, "reprovado" se for menor que sete, e "
		 * aprovado com distinção" se a media for igual a 10
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a primeira nota ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a primeira nota ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media ==10) {
			System.out.println("aprovado com distinção");
		}else if (media >= 7) {
			System.out.println("aprovado ");
		}else {
			System.out.println("reprovado");
		}
	}

}
