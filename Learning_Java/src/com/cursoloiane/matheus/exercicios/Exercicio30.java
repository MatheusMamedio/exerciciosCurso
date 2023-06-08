package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		/*
		 * exercicio 30, faça um programa que calcule as raizes de uma equação de
		 * segundo grau, forma ax2 +bx+c, o programa deverá pedir os valores de a, b e c.
		 * 1-se o usuario digitar valor de A = a 0, não é uma equação de segundo grau, programa encerra.
		 * 2-se o delta calculado for negativo,equação não possui raizes reais, informe e encerre.
		 * 3-se delta calculado for 0, equação possui apenas uma raiz real, informw ao usuario
		 * 4-se o delta for positivo, a equação possui duas raiz reais, informe ao usuario
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entre com o valor de a: ");
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println("não é uma equação de segundo grau");
		}else {
			System.out.println("entre com o valor de b: ");
			int b = scan.nextInt();
			
			System.out.println("entre com o valor de c: ");
			int c = scan.nextInt();
			
			double delta = (b*b) - (4*a*c);
			if(delta<0) {
				System.out.println("delta negativo");
			}else {
				
				System.out.println("delta= "+ delta);
				double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
				
				System.out.println("x1 = "+ x1);
				System.out.println("x2 = "+ x2);
				
				
				
				
			}
		}
		
	}

}
