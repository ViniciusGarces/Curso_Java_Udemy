package soma_vetores;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
  
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<n; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<n; i++) {
			vetorB[i] = sc.nextInt();
		}
		System.out.println("Vetor Resultante: ");
		for(int i=0; i<n; i++) {
			vetorC[i] = vetorB[i] + vetorA[i];
			System.out.println(vetorC[i]);
		}
		
		
		
		
		
		sc.close();
	}

}
