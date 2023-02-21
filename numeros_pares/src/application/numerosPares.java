package application;

import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, qtdPares;
		
		System.out.print("Quantos números você vai digitar: ");
		n = sc.nextInt();
		
		int[] numero = new int[n];

		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			numero[i] = sc.nextInt();
		}
		qtdPares = 0;
		System.out.println("\nNÚMEROS PARES: ");
		for(int i=0; i<n; i++) {
			if(numero[i] % 2 == 0) {
				System.out.print(  numero[i] + " ");
				qtdPares++;
			}
		}
		System.out.println("\nQUANTIDADE DE PARES = " + qtdPares);
		
		sc.close();

	}

}
