package aulas.data.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.now(); //instanciando para data de agora
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now(); //data hora padrao GMT
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //especifica qual fuso horario usar
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d04 = LocalDate.parse("2023-06-17"); //ISO 8601
		LocalDateTime d05 = LocalDateTime.parse("2023-06-17T23:54:32");
		Instant d06 = Instant.parse("2023-06-17T23:54:32Z"); //instant é preciso especuficar o fuso horario
		Instant d07 = Instant.parse("2023-06-17T23:54:32-03:00"); //especificando um timezone diferente do GMT
		
		//texto formato customizado
		LocalDate d08 = LocalDate.parse("23/06/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("23/06/2023 16:01", fmt2);
		
		//passando (dia, mes, ano) isoladamente
		LocalDate d10 = LocalDate.of(2023, 9, 20);
		LocalDateTime d11 = LocalDateTime.of(2023, 9, 20, 1, 30 );
		
		System.out.println("Data de agora: " + d01);
		System.out.println("Data e hora: " + d02);
		System.out.println("Data e hora GMT: " + d03);
		System.out.println("Data: " + d04.toString());
		System.out.println("Data e hora: " + d05.toString());
		System.out.println("Data e hora de agora: " + d06.toString());
		System.out.println("Data e hora de agora: " + d07.toString());
		System.out.println("Data: " + d08.toString());
		System.out.println("Data e hora de agora: " + d09.toString());
		System.out.println("Data: " + d10.toString());
		System.out.println("Data e hora: " + d11.toString());
		
		//imprimindo de forma alternativa
		System.out.println("Data e hora: " + d09.format(fmt2));
		System.out.println("Data: " + fmt1.format(d08));
		System.out.println("Data e hora: " + fmt3.format(d06));
		System.out.println("Data e hora: " + d05.format(fmt4));
		System.out.println("Data e hora: " + fmt5.format(d06));
	}
}
