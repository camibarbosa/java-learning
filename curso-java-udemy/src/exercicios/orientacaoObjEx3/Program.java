package exercicios.orientacaoObjEx3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um aluno e as três notas que 
		 * ele obteve nos três trimestres do ano (primeiro trimestre vale 30 
		 * e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota 
		 * final do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou 
		 * não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter
		 *  o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		
		System.out.println("Student name: ");
		student.nome = sc.nextLine();
		
		student.primeiroTri = sc.nextDouble();
		student.segundoTri= sc.nextDouble();
		student.terceiroTri = sc.nextDouble();
	
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f points", student.points());
		} else {
			System.out.println("PASS");
		}
			
		sc.close();
	
	}

}
