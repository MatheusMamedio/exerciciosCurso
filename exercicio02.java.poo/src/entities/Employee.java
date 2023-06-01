package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	double netSalary(){
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	public String toString () {
		return "dados atualizados: " +"olá " + name + " seu salario atual é " + String.format(" R$%.2f", netSalary());
	}

}
