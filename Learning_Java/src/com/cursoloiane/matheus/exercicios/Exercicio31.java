package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		/*
		 * exercicio 31, faça um programa que peça um numero correspondente a um
		 * determinado ano e em seguida informe se é um ano bissexto.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("entre com o ano: ");
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 100)) {
			System.out.println("é ano bissexto");
		}else System.out.println("não é bissexto");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
