package exercicios.basicos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Exercicio sobre Scanner.
		  
		Scanner scan = new Scanner(System.in);
		float dinheiroAtual = 0;
		float adcional = 0;
		//nome e sobrenome
		System.out.print("Digite seu nome:");
		String nome = scan.next();
		System.out.print("Digite seu sobrenome:");
		String sobrenome = scan.next();
		
		System.out.println("olá, seja bem vindo " + nome + " " + sobrenome);
		
		System.out.print("qual sua idade:");
		int idade = scan.nextInt();
		
		System.out.print("quantos Reais você tem atualmente R$:");
		dinheiroAtual = scan.nextFloat();
		
		System.out.println("================================================");
		System.out.println(" olá " + nome + " " + sobrenome + " voce tem " + idade + " anos e");
		System.out.println("atualmente na sua conta bancaria tem " + dinheiroAtual + "R$");
		
		System.out.print("quanto voce quer adcionar hoje:");
		adcional = scan.nextFloat();
		
		System.out.println("=============================");
		float result = dinheiroAtual + adcional;
		System.out.println("agora voce tem R$" + result);
		System.out.println("=============================");
		
		scan.close();

	}

}
