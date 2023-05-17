package exercicios.list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.list.entities.Employee;

public class Program {
	public static void main(String[] args) {
		/*Faça um programa para ler um número inteiro N e depois os dados
		 * (id, nome e salario) de N funcionarios. Nao deve haver repeticao de id.
		 * Em seguida, efetue o aumento de x por cento no salario de um determinado funcionario.
		 * Para isso, o programa deve ler um id e o valor x. Se o id informado nao existir, 
		 * mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionarios.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> empList = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while(hasId(empList, id)) {
				System.out.println("This id is already taken. Try again!");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			empList.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary encrease: ");
		int idSalary = sc.nextInt();
		
		Employee emp = empList.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer pos = position(empList, idSalary);
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee employee : empList) {
			System.out.println(employee);
		}

		sc.close();
	}
	
	//procura a posicao do elemento na lista
	public static Integer position(List<Employee> empList, int id) {
		for(int i = 0; i < empList.size(); i++) {
			if(empList.get(i).getId() == id) {
				return i;
			}
		}
		return null; //elemento nao foi encontrado
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
