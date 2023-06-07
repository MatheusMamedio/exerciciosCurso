package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * exercicio 8, faça um programa que pergunte quanto voce ganha por hora e o
		 * numero de horas trabalhadas no mês. Calcule e mostre o total do seu salario
		 * no referido mês, sabendo que são descontados 11% para o imposto de renda,
		 * 8% para INSS e 5% para o sindicato, faça um programa que nos dê: 
		 *    salario bruto
		 * A: quanto pagou ao INSS
		 * B: quanto pagou ao sindicato
		 * C: salario liquido
		 * D: calcule os descontos e o salario liquido, conforme a tabela abaixo.
		 *  + Salario Bruto: R$ - If(11%) : R$ - INSS (8%): R$ - Sindicato (5%) : R$ 
		 *  = salario liquido
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor/hora");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato +ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("o salario Bruto é: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("total de descontos: " + totalDescontos);
		System.out.println("salario liquido: " + salarioLiquido);

	}

}
