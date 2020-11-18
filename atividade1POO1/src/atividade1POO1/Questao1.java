package atividade1POO1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a altura em metros: ");
		double altura = sc.nextDouble();
		System.out.println("Informe o peso em kilogramas: ");
		double peso = sc.nextDouble();
		System.out.println("Informe o sexo (m ou f): ");
		char sexo = sc.next().charAt(0);
		
		double pesoIdeal;
		if (sexo == 'm')
			pesoIdeal = (72.7 * altura) - 58;
		else
			pesoIdeal = (62.1 * altura) - 44.7;
		
		System.out.println("Altura: " + altura + "m");
		System.out.println("Peso: " + peso + "kg");
		if (sexo == 'm')
			System.out.println("Sexo: Masculino");
		else
			System.out.println("Sexo: Feminino");
		System.out.println("Peso ideal: " + pesoIdeal + "kg");
		if (peso > pesoIdeal)
			System.out.println("Aviso: Peso acima do peso ideal");
		else if (peso < pesoIdeal)
			System.out.println("Aviso: Peso abaixo do peso ideal");
		else
			System.out.println("Aviso: Peso equivalente ao peso ideal");
		
		sc.close();
	}

}
