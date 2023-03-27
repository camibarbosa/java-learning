package exercicios.orientacaoObjEx2;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	// função que calcula o salário líquido do funcionário, ou seja, o salário bruto menos o imposto.
	public double netSalary() {
		return grossSalary - tax;
	}
	
	//recebe uma porcentagem como parâmetro, calcula o valor do aumento e adiciona-o ao salário bruto do funcionário.
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.00;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
}
