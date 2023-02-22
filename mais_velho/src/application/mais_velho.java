package application;

import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, maisVelho, velho;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
		System.out.printf("Dados da  %da pessoa:\n", i + 1);
		System.out.print("Nome: ");
		nome[i] = sc.next();
		System.out.print("Idade: ");
		idade[i] = sc.nextInt();
		}
		maisVelho = 0;
		velho = idade[0];
		for(int i=1; i<n; i++) {
			if(idade[i] > velho) {
				velho = idade[i];
				maisVelho= i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s", nome[maisVelho]);
		
		sc.close();

	}

}
