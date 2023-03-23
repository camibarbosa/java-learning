package aulas;

public class StringFuncoes {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase(); //transforma os caracteres para caixa alta
		String s03 = original.trim(); //remove os espaços nos cantos da string
		String s04 = original.substring(2); //cria uma nova string somente a partir do segundo caracter
		String s05 = original.substring(2, 9); 
		String s06 = original.replace('a', 'x'); //substitui todo a por x
		String s07 = original.replace("abc", "xyz");
		int i = original.indexOf("bc"); //mostra a posição  da primeira ocorrencia da variavel
		int k = original.lastIndexOf("bc"); //mostra a posicao da ultima ocorrencia da variavel
		
		//recorta string
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("substring: -" + s05 + "-");
		System.out.println("replace: -" + s06 + "-");
		System.out.println("replace: -" + s07 + "-");
		System.out.println("IndexOf: -" + i + "-");
		System.out.println("lastIndexOf: -" + k + "-");
		System.out.println("-----------------------------");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
	}
}
