package br.java.matriz;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		int[][] matriz2 = new int[10][10];
		Random aleatorio = new Random();
		System.out.println("Matriz Aleatória:");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				matriz[linha][coluna] = aleatorio.nextInt(4);
				matriz2[linha][coluna] = aleatorio.nextInt(3);
				System.out.print(" " + matriz[linha][coluna] + " ");
			}
			System.out.println(); // Pulando Linha
		}
		/// TRAINGULOS /\
		System.out.println("\n\n");
		System.out.println("Triangulo Inferior:");

		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (linha < coluna) {
					System.out.print(matriz[linha][coluna]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Pulando Linha
		}
		System.out.println("\n\n");
		System.out.println("Triangulo Superior:");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (linha > coluna) {
					System.out.print(" "+matriz[linha][coluna]+" "); // Imprimindo apenas o triangulo superior
					}else {
						System.out.print(" ");
					}
			}
			System.out.println(); // Pulando Linha
		}
		System.out.println("\n\n");
		// Diagonais:
		System.out.println("Diagonal Principal:");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (linha == coluna) {
					System.out.print(" "+matriz[linha][coluna]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Pulando Linha
		}
		System.out.println("\n\n");
		System.out.println("Diagonal Secundaria:");
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (linha + coluna == 9) {
					System.out.print(" "+matriz[linha][coluna]+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Pulando Linha
		}
		// Multiplicação
		System.out.println("\n\n");
		System.out.println("Multiplicando a matriz pela mesma");
		int resultado = 0;
		int[][] matriz3 = new int[10][10];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz2[0].length; j++) {
				for (int k = 0; k < matriz[0].length; k++) {
					resultado = matriz[i][k] * matriz[k][j] + resultado;
				}
				matriz3[i][j] = resultado;
				resultado = 0;
				if(matriz3[i][j] > 9) {
					System.out.print(" "+matriz3[i][j]);	
				}else {
					System.out.print(" 0"+matriz3[i][j]);
				}
				
			}
			System.out.println();
		}
	}
}