package application;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double mediaVetor, somaVetor;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		somaVetor = 0;
		for(int i=0; i<n; i++) {
			somaVetor += vetor[i];
		}
		mediaVetor = somaVetor / n;
		System.out.printf("MÉDIA DO VETOR: %.3f%n " , mediaVetor);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i=0; i<n; i++) {
			if(vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
	}

}
