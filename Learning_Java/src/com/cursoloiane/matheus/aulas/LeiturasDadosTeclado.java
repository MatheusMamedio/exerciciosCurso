package com.cursoloiane.matheus.aulas;

import java.util.Scanner;

public class LeiturasDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu primeiro nome, idade, quantidade de filhos altura e se tem algum bichinho de estimação:");

		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		System.out.println("você digitou os seguintes valores:");
		System.out.println("Primeiro Nome:" + primeiroNome);
		System.out.println("idade" + idade);
		System.out.println("quantidade de filhos" + qtdFilhos);
		System.out.println("Altura" + altura);
		System.out.println("tem bichinho de estimação:" + temPet);

		scan.close();

	}

}
