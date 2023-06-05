package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * exercicio 8, faça um programa que pergunte quanto voce ganha por hora e o
		 * numero de horas trabalhadas no mês. Calcule e mostre o total do seu salario
		 * no referido mês.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas");
		double horas = scan.nextDouble();

		double salario = valorHora * horas;

		System.out.println("o salario é: " + salario);
		
		scan.close();

	}

}
