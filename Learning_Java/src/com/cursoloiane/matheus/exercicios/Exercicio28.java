package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		/*exercicio 28, faça um programa que lê as duas notas parciais obtidas por um aluno 
		 *numa disciplina ao longo de um semestre e calcule a sua média. A atribuição de conceitos 
		 *entre 9.0 e 10.0 conceito A
		 *entre 7.5 e 9.0  conceito B
		 *entre 6.0 e 7.5  conceito C
		 *entre 4.0 e 6.0  conceito D
		 *entre 4.0 e 0.0  conceito E
		 **/

		Scanner scan = new Scanner(System.in);
		System.out.print("entre com a nota do trabalho:");
		float nota1 = scan.nextFloat();

		System.out.print("entre com a nota da avaliação:");
		float nota2 = scan.nextFloat();


		float media = (nota1 + nota2) / 2;
		System.out.println("a media: " + media);

		if (media >= 9 && media <= 10) {
			System.out.println("Conceito A");
		}
		else if (media >= 7.5 && media < 9) {
			System.out.println("Conceito B");
		}
		else if (media >= 6 && media < 7.5) {
			System.out.println("Conceito C");
		}
		else if (media >= 4 && media < 6) {
			System.out.println("Conceito D");
		}
		else if (media >= 0 && media < 4) {
			System.out.println("Conceito E");
		}
	
		scan.close();
	}

}
