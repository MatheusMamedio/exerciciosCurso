package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com um numero inteiro");
		int numero = scan.nextInt();
		System.out.println("o numero digitado foi: " + numero);
		scan.close();
	}

}
