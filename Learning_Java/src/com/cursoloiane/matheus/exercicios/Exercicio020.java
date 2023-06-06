package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio020 {

	public static void main(String[] args) {
		/* exercicio 20, faça um programa que leia três numeros e mostre o maior deles*/
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com primero: ");
		int num1= scan.nextInt();
		
		System.out.println("Entre com segundo: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro: ");
		int num3 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" é o maior");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2+" é o maior");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println(num3+" é o maior");
		}
		scan.close();
		
		
		
		
		
		
	}

}
