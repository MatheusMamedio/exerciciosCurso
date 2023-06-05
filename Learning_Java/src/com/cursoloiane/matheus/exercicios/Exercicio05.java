package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// exercicio 5, faça um programa que converta metros pra centimetros

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de metros");
		double metros = scan.nextDouble();

		// 1m = 100cm
		double cm = metros * 100;

		System.out.println(metros + "m é igual a " + cm + "cm");
		
		scan.close();

	}

}
