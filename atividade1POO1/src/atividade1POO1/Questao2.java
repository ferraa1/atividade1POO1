package atividade1POO1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário: ");
		double sal = sc.nextDouble();
		
		double aumento;
		if (sal <= 280.0) {
			aumento = 1.20;
		} else if (sal < 700.0) {
			aumento = 1.15;
		} else if (sal < 1500.0) {
			aumento = 1.1;
		} else {
			aumento = 1.05;
		}
		
		System.out.println("Salário original: R$" + sal);
		System.out.println("Percentual de aumento aplicado: " + (int)((aumento - 1) * 100) + "%");
		System.out.println("Valor do aumento: " + ((sal * aumento) - sal));
		System.out.println("Novo salário: " + (sal * aumento));
		
		sc.close();
	}

}
