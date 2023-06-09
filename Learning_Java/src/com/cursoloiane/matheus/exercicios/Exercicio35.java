package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		/*um posto esta vendendo combustiveis com a seguinte tabela de descontos:
		 * AlCOOL:
		 * a. até 20 litros, desconto de 3%
		 * b. acima de 20 litros, desconto de 5% por litro
		 * 
		 * GASOLINA:
		 * c. ate 20 litros, desconto de 4% por litro
		 * d. acima de 20 litros, desconto de 6% por litro.
		 * algoritmo deve ler o numero de litros vendidos, 
		 * o tipo de combustivel(G-gasolina,A-alcool) calcule e imprima o valor
		 * a ser pago pelo cliente*/
		
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("quantidade de litros:");
		double litros = scan.nextDouble();
		
		System.out.println("Entre com o tipo de combustivel, digite tecla [A] Alcool ou tecla [G] Gasolina");
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesc =0;
		
		if(tipo.equalsIgnoreCase("a")) {
			if(litros <= 20) {
				percDesconto =3;
				
			}else {
				percDesconto=5;
			}
			total = litros * precoAlc;
			
		}else if(tipo.equalsIgnoreCase("a")) {
			if(litros <= 20) {
				percDesconto =4;
				
			}else {
				percDesconto=6;
			}
			total = litros * precoGas;
		}
		totalDesc = (total/100) * percDesconto;
		
		double precoApagar = total - totalDesc;
		
		
		System.out.println("valor a ser pago: "+precoApagar);
	
	}

}
