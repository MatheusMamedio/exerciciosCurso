package com.cursoloiane.matheus.exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		/*faça um prorama que faça 5 perguntas para uma pessoa sobre um crime.As perguntas são:
		 * no final deve emiti uma classificação sobre a participação da pessoa no crime,
		 * se a pessoa responder positivamente a w questões ela é "suspeita" entre 3 e 4 "cumplice"
		 * e 5 como assassino, caso contrario ela é inocente.
		 * ."telefonou pra vitima?"
		 * a. "esteve no local do criem?"
		 * b. "Mora perto da vitima?"
		 * c. "devia para vitima?"
		 * d. "ja trabalhou com a vitima"
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Telefonou para vitima?");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime??");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da vitima?");
		String resp3 = scan.next();
		
		System.out.println("ja trabalhou com a vitima?");
		String resp4 = scan.next();
		
		System.out.println("Devia para vitima?");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S") ) {
			cont++;
		}
		
		if (resp2.equalsIgnoreCase("S") ) {
			cont++;
		}
		
		if (resp3.equalsIgnoreCase("S") ) {
			cont++;
		}
		
		if (resp4.equalsIgnoreCase("S") ) {
			cont++;
		}
		
		if (resp5.equalsIgnoreCase("S") ) {
			cont++;
		}
		
		if(cont ==2) {
			System.out.println("Suspeito");
		}else if(cont == 3 || cont == 4 ) {
			System.out.println("Cumplice");
		}else if(cont == 5) {
			System.out.println("Assassino");
		}else if(cont == 0 ) {
			System.out.println("Inocente");
		}
		scan.close();

	}

}
