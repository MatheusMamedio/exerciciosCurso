package exercicio02;

import java.util.Scanner;

import entities.Employee;

public class Program {
		
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Nome: ");
		emp.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		emp.grossSalary  =  sc.nextDouble();
		System.out.print("imposto:");
		emp.tax = sc.nextDouble();
		System.out.println(emp);
		System.out.println("qual o percentual de aumento do salario?");
		double taxa =sc.nextDouble();
		emp.increaseSalary(taxa);
		System.out.println(emp);
	}

}
