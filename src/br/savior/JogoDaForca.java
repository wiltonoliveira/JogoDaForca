package br.savior;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		inicio();
	}
	
	public static void inicio(){
		traco(palavraOculta());
		
		int erros = 0;
		char[] status = new char [10];
		status = iniciaTela();
		
		
		
		do {
			char letra = retornaLetra();
			status = checaLetra (letra, status, palavraOculta());
			imprimeStatus (status);
			erros += checaErro (palavraOculta(), letra);
			imprimeBoneco (erros);
			
		} while (erros < 6);
	
		
	}
	
	
	public static char retornaLetra(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma letra qualquer: ");
		char letra = scan.next().charAt(0);
		
		return letra;
	}
	
	public static char[] iniciaTela () {
		char[] x = new char [10];
		
		for (int i = 0; i < 10; i++) {
			x [i] = '_';
		}
		
		return x;
	}
	
	public static char[] palavraOculta(){
		char[] palavra = new char [10];
		
		palavra[0] = 'd';
		palavra[1] = 'e';
		palavra[2] = 'm';
		palavra[3] = 'o';
		palavra[4] = 'c';
		palavra[5] = 'r';
		palavra[6] = 'a';
		palavra[7] = 'c';
		palavra[8] = 'i';
		palavra[9] = 'a';
		
		return palavra;
	}
	
	public static void traco (char[] palavra){
		for (int i = 0; i < palavra.length; i++) {
			System.out.print("_ " + "");
			
		}
		System.out.println("\n");
	}
	
	public static char[] checaLetra (char letra, char[]tela, char[] palavra) {
		
		for (int i = 0; i < tela.length; i++) {
			if (palavra[i] == letra) {
				tela[i] = letra;
			}
		}
		
		
		return tela;
	}
	
	public static int checaErro (char[] palavra, char letra) {
		int erro = 1;
		
		for (int i = 0; i < palavra.length; i++) {
			if (palavra[i] == letra) {
				erro = 0;
			}
		}
		
		return erro;
	}
	
	public static void imprimeStatus (char[] status) {
		for (int i = 0; i < status.length; i++) {
			System.out.print(status[i] + " ");
		}
	}
	
	public static void imprimeBoneco (int erros) {
		System.out.println("\n");
		
		switch (erros) {
		case 0: {
			System.out.println("");
			System.out.println(" | |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("---");
			break;
		}
		case 1: {
			System.out.println("  _ _");
			System.out.println(" | |");
			System.out.println(" | O");
			System.out.println(" |");
			System.out.println("---");
			break;
		}
		case 2: {
			System.out.println("  _ _ _");
			System.out.println(" |  |");
			System.out.println(" |  O");
			System.out.println(" |  |");
			System.out.println("---");
			break;
		}
		case 3: {
			System.out.println("  _ _ _");
			System.out.println(" |  |");
			System.out.println(" |  O");
			System.out.println(" |  |");
			System.out.println("---/");
			break;
		}
		case 4: {
			System.out.println("  _ _ _");
			System.out.println(" |  |");
			System.out.println(" |  O");
			System.out.println(" |  |");
			System.out.println("---/  |");
			break;
		}
		case 5:{
			System.out.println("  _ _ _");
			System.out.println(" |  |");
			System.out.println(" |  O");
			System.out.println(" | /|-");
			System.out.println("---/ |");
			break;
		}
		}
	}
	
}

















