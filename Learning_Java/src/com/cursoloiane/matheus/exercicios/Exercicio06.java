package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * exercicio06, faça um programa que peça o raio de um circulo, calcule e mostre
		 * sua area
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o raio do circulo");
		double raio = scan.nextDouble();

		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("A area do circulo é: " + area);
		scan.close();
		   

	}

}
