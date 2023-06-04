package exercicio03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercicio03 POO
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Student's Name:"); student.student = scan.nextLine();
		System.out.println("Student Grade:");
		student.grade1 = scan.nextDouble();
		student.grade2 = scan.nextDouble();
		student.grade3 = scan.nextDouble();
		if (student.result() > 60) {
			System.out.println("FINAL GRADE = " + student.result() + " PASS");
		} else {
			System.out.println("FINAL GRADE = " + student.result() + " Failed");
		}
		
		scan.close();
		
		

	}

}
