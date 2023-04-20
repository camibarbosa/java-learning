package aulas.foreach;

public class Program {
	public static void main(String[] args) {
		String[] vect = new String[] {
				"Maria", "Luana", "Rael"
		};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-----------------");
		
		//O loop for each é como um loop for tradicional, mas que só funciona para percorrer 
		//um vetor do início ao fim, passando por todos os elementos do vetor sem pular qualquer um deles.
		//ForEach
		for (String obj : vect){
			System.out.println(obj);
		}
	}
}
