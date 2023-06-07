package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		/*
		 * exercicio 26,faça um programa para o calculo de uma folha de pagamento, O
		 * programa devera pedir ao usuario o valor da sua hora e a quantidade de horas
		 * trabalhadas no mês. desconto do IR:
		 * Salario bruto ate 900(inclusive) - isento
		 * Salario bruto ate 1500(inclusive) - desconto de 5%
		 * salario bruto ate 2500 - desconto de 20% 
		 * imprima na tela as informações.
		 * o valor da hora é 5 e a quantidade de hora é 220
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com o valor das horas trabalhadas: ");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto =  valorHora * qtdHoras;
		
		int percentualIR = 0;
		if(salarioBruto <=900) {
			percentualIR = 0;
		}else if(salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if(salarioBruto > 2500) {
			percentualIR = 20;
		}
	
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: (" + valorHora+" * "+qtdHoras+"):"+salarioBruto);
		System.out.println("(-)IR ("+ percentualIR+"%)"+ ir);
		System.out.println("(-)INSS(10%): "+ inss);
		System.out.println("FGTS(11%): "+fgts);
		System.out.println("Total de descontos:"+totalDescontos);
		System.out.println("Salário liquido: "+salarioLiquido);
		scan.close();


	}

}
