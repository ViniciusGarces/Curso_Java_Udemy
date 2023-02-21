package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicaoMaior;
		double maior;
		
		System.out.print("Quantos números você vai digitar: ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		posicaoMaior = 0;
		maior = vetor[0];
		for(int i=1; i<n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.print("POSICAO DO MAIOR VALOR = " +  posicaoMaior);
		
		
		
		sc.close();
	}

}
