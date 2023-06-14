package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		/*
		 * faça um programa que peça uma nota, entre 0 e 10. mostre uma mensagem caso
		 * o valor seja invalido e continue pedindo até que o usuario informe um valor
		 * valido.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		boolean notaValida = false;
		
		do {
			
		System.out.println("entre com a nota entre [0 e 10]");
		
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: "+nota);
			}else {
				notaValida = false;
				System.out.println("Nota invalida, tente novamente com numeros entre [0 e 10]");
			}
		
		}while(!notaValida);
		
		
		
		

	}

}
