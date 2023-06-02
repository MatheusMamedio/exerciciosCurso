package exercicios.basicos;

import java.util.Scanner;

public class ExercicioScann02 {

	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println("Relatório de clientes");
		System.out.println("======================");
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o primeiro nome:");
		String pessoa1 = scan.next();
		System.out.print("digite a idade:");
		int idadePessoa1 = scan.nextInt();
		
		System.out.print("digite o segundo nome:");
		String pessoa2 = scan.next();
		System.out.print("qual a segunda idade:");
		int idadePessoa2 = scan.nextInt();
		
		System.out.print("qual o terceiro nome:");
		String pessoa3 = scan.next();
		System.out.print("qual a terceira idade idade:");
		int idadePessoa3 = scan.nextInt();

		System.out.println("=================================");
		System.out.println("Relatorio de clientes");
		System.out.println("=================================");
		System.out.println(pessoa1 + " tem " + idadePessoa1 + " anos de idade");
		System.out.println(pessoa2 + " tem " + idadePessoa2 + " anos de idade");
		System.out.println(pessoa3 + " tem " + idadePessoa3 + " anos de idade");
		System.out.println("=================================");

		scan.close();

	}

}
