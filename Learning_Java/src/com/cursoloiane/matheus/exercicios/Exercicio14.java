package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * Exercicio 14, Faça um programa que peça o tamanho de um arquivo para
		 * download(em MB) e a velocidade de um link de internet (em Mbps), calcule e
		 * informe o tempo aproximado de download do arquivo usando este link (em
		 * minutos)
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o tamanho do arquivo:");
		double tamArquivo = scan.nextDouble();

		System.out.println("Entre com a velocidade de internet:");
		double veloInternet = scan.nextDouble();

		double tempo = tamArquivo / veloInternet;

		System.out.println("tempo de download: " + tempo);
		
		scan.close();

	}

}
