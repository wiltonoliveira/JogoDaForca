package br.savior;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		inicio();
	}
	
	public static void inicio(){
		traco(palavraOculta());
		int pos = 0;
		int erros = 0;
		String[] status = new String [10];
		status = iniciaTela();
		
		do {
		String letra = retornaLetra();
			
			do {
				pos = checaLetra(pos, letra, palavraOculta());
				status = atualizaTela (status, pos, letra);
				imprimeTela (status);
				
			}while (pos != 0);
			
			
			System.out.println("\n");
			erros++;
			
		} while (erros < 6);
	
		
	}
	
	
	public static String retornaLetra(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma letra qualquer: ");
		String letra = scan.next();
		return letra;
	}
	
	public static String[] iniciaTela () {
		String[] x = new String [10];
		
		for (int i = 0; i < 10; i++) {
			x [i] = "_";
		}
		
		return x;
	}
	
	public static String palavraOculta(){
		return "democracia";
	}
	
	public static void traco (String palavra){
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print("_ " + "");
			
		}
		System.out.println("\n");
	}
	
	public static String[] tela (int pos, String[] original, String letra, String palavra) {
		
		
		return original;
	}
	
	public static int checaLetra (int pos, String letra, String palavra) {
		
		for (int i = pos; i < palavra.length(); i++) {
			if (palavra.substring(i, i+1).equals(letra)) {
				pos = i + 1;
				//System.out.print(letra);
				return pos;
			}
			/*
			else {
				System.out.print("_ ");
			}
			*/
		}
		
		return 0;
	}
	
	public static String[] atualizaTela (String[] original, int pos, String letra) {
		original[pos - 1] = letra;
		
		return original;
	}
	
	public static void imprimeTela (String[] status) {
		for (int i = 0; i < status.length; i++) {
			System.out.print(status[i] + " ");
		}
		System.out.println("\n");
	}
	
}

















