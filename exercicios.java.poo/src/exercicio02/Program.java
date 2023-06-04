package exercicio02;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//exercicio02 POO
		Employee emp = new Employee();

		Scanner scan = new Scanner(System.in);
		System.out.print("Nome: ");
		emp.name = scan.nextLine();
		System.out.print("Salario bruto: ");
		emp.grossSalary = scan.nextDouble();
		System.out.print("imposto:");
		emp.tax = scan.nextDouble();
		System.out.println(emp);
		System.out.println("qual o percentual de aumento do salario?");
		double taxa = scan.nextDouble();
		emp.increaseSalary(taxa);
		System.out.println(emp);
		scan.close();

	}

}
