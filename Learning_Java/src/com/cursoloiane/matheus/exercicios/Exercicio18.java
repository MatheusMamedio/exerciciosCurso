package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * exercicio 18, faça um programa que verifique se uma letra digitada é vogal ou
		 * consoante
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra ");
		String letra = scan.next();

		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			System.out.println("é uma vogal");
			break;
		default:
			System.out.println("é uma consoante");
		}
		scan.close();
		
		
		
		
		

	}

}
