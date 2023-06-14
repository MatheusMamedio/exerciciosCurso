package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		/*
		 * faça um programa que leia e valide as seguintes informações: a.Nome: maior
		 * que 3 caracteres; b.Idade: maior que 150 anos; c.Salario: maior que 0;
		 * d.Sexo: 'f' ou 'm'; e. estado civil: 's','c','v','d';
		 */

		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String eCivil;

		boolean infoValida = false;

		do {

			System.out.println("Nome: ");
			nome = scan.next();

			if (nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no minimo 3 carecteres ");
			}
		} while (!infoValida);
		infoValida = false;

		do {
			System.out.println("Idade: ");

			idade = scan.nextInt();

			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("idade precisa ser entre 0 e 150");
			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Salario: ");

			salario = scan.nextDouble();

			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("salario precisa ser maior que 0 ");
			}

		} while (!infoValida);

		infoValida = false;

		do {
			System.out.println("Sexo[M/F]: ");

			sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo invalido, precisa ser 'F' ou 'M' ");
			}

		} while (!infoValida);

		infoValida = false;

		do {

			System.out.println("Estado Civil [S/C/V/D] ");

			eCivil = scan.next();

			if (eCivil.equalsIgnoreCase("s") || eCivil.equalsIgnoreCase("c") || eCivil.equalsIgnoreCase("v")
					|| eCivil.equalsIgnoreCase("d")) {

				infoValida = true;

			} else {
				System.out.println("Sexo invalido, precisa ser 'F' ou 'M' ");
			}

		} while (!infoValida);

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salario: " + salario);
		System.out.println("Estado Civil: " + eCivil);
		scan.close();
	}

}
