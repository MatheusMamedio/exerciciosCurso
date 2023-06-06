package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		/*
		 * exerccio 25, faça um programa que recebe o salario de um colaborador e o
		 * reajuste segundo o seguinte criterio, baseado no salario atual: 
		 * salarios ateR$ 280,00(incluido): aumento de 20%.
		 * salarios entre 280,00 e R$ 700: aumento 15% entre 700,00 e 1500,00: aumento 10% 
		 * salarios de 1500,00 em diante: aumento de 5% aposo aumento ser realizado,
		 * informe na tela: salario antes do reajuste, percentual de aumento aplicado, o valor
		 *  do aumento, novo 
		 *  salario apos o aumento.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o seu salario: ");
		double salario = scan.nextDouble();

		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;

		} else if (salario > 280 && salario < 700) {
			percentual = 15;
		} else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		} else if (salario >= 1500) {
			percentual = 10;
		}

		double aumento = (salario / 100) * percentual;

		double salarioAjustado = salario + aumento;

		System.out.println("salario: " + salario);
		System.out.println("percentual: " + percentual);
		System.out.println("aumento: " + aumento);
		System.out.println("Salario reajustado: " + salarioAjustado);

	}

}
