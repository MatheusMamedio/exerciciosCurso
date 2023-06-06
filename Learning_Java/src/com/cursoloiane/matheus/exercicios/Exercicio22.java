package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		/*
		 * exercicio 21, faça um programa que pergunte o preço de três produtos e
		 * informequal produto você deve comprar, sabendo que a decisão é sempre o mais
		 * barato
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com primero preço: ");
		double preco1 = scan.nextDouble();

		System.out.println("Entre com segundo preço: ");
		double preco2 = scan.nextDouble();

		System.out.println("Entre com o terceiro preço: ");
		double preco3 = scan.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("compre o produto 2");
		}else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("compre o produto 3");
		} 

	}

}
