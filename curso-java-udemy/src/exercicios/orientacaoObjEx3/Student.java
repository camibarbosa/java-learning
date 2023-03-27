package exercicios.orientacaoObjEx3;

public class Student {
	
	public String nome;
	public double primeiroTri;
	public double segundoTri;
	public double terceiroTri;
	
	public double finalGrade() {
		return primeiroTri + segundoTri + terceiroTri;
	}
	
	public double points() {
		if(finalGrade() < 60) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
}
