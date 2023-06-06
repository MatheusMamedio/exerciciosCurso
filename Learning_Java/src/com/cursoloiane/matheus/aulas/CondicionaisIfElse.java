package com.cursoloiane.matheus.aulas;

import java.util.Scanner;

public class CondicionaisIfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor do item");

		double valor = scan.nextDouble();

		if (valor <= 10) {
			System.out.println("Esta barato, pode comprar");
		} else if (valor < 10 && valor < 15) {
			System.out.println("Você pode pedir desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Você pode pesquisar mais.");
		} else {
			System.out.println("MUITO CARO.");
		}
		scan.close();
	}

}
