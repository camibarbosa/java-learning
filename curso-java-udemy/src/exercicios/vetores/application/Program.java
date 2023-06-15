package exercicios.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.vetores.entities.Rent;

public class Program {
	public static void main(String[] args) {
		 int n = 1;
	        while (n < 20) {
	            if (n%7 == 0) {
	                continue;
	            }
	            System.out.println(n);
	            n++;
	       }
	   }
	}

