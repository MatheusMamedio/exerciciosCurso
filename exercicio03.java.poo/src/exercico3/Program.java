package exercico3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("digite as notas: ");
		student.aluno = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		if(student.result() > 60) {
			System.out.println("FINAL GRADE = "+ student.result() +" PASS");
		}else {
			System.out.println("FINAL GRADE = "+ student.result() +" Failed");
		}
		

	}

}
