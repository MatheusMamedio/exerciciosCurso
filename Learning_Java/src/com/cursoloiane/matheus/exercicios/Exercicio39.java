package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		/*
		 * faça um programa que leia o nome de um usuario e sua senha e não aceite a
		 * senha igual ao nome de usuario, mostre uma mensagem de erro e voltando a
		 * pedir informações
		 */

		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		do {

			System.out.println("Usuario: ");
			nomeUser = scan.next();

			System.out.println("senha: ");
			senha = scan.next();

			if (nomeUser.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Erro, senha igual ao usuario, tente novamente ");
			} else {
				infoValidas = true;

				System.out.println("senha e usuarios validos");
			}

		} while (!infoValidas);
		scan.close();
	}

}
