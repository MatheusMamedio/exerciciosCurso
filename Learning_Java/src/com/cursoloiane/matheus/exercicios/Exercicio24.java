package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		/*
		 * faça um programa que pergunte em que turno você estuda. Peça para digitar
		 * M-matutino ou v-vespertino ou N-noturnon imprima a mensagem "bom dia!",
		 * "boa tarde!" ou "boa noite!" ou valor invalido conforme ocaso
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu turno [M/V/N]: ");
		String turno = scan.next();

		switch (turno) {
		case "m":
		case "M":
			System.out.println("Bom dia!");
			break;
		case "v":
		case "V":
			System.out.println("Bom Tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Bom noite!");
			break;
		default: System.out.println("valor invalido");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
