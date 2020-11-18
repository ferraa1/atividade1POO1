package atividade1POO1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int notas100 = 0;
		int notas50 = 0;
		int notas10 = 0;
		int notas5 = 0;
		int notas1 = 0;
		
		System.out.println("Informe o valor do saque (entre 10 e 600 reais): ");
		int valor = sc.nextInt();
		int resto = valor;
		
		if (resto >= 100) {
			notas100 = resto / 100;
			resto = resto % 100;
		}
		if (resto >= 50) {
			notas50 = resto / 50;
			resto = resto % 50;
		}
		if (resto >= 10) {
			notas10 = resto / 10;
			resto = resto % 10;
		}
		if (resto >= 5) {
			notas5 = resto / 5;
			resto = resto % 5;
		}
		if (resto >= 1) {
			notas1 = resto / 1;
		}
		
		System.out.println("Quantidade de notas de 100 = " + notas100);
		System.out.println("Quantidade de notas de 50 = " + notas50);
		System.out.println("Quantidade de notas de 10 = " + notas10);
		System.out.println("Quantidade de notas de 5 = " + notas5);
		System.out.println("Quantidade de notas de 1 = " + notas1);
		
		sc.close();
	}

}
