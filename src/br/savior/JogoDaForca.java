package br.savior;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		inicio();
	}
	
	public static void inicio(){
		traco(palavraOculta());
		int pos = 0;
		int tentativas = 0;
		
		do {
		String letra = retornaLetra();
			
			do {
				pos = checaLetra(pos, letra, palavraOculta());
				
			}while (pos != 0);
			
			System.out.println("\n");
			tentativas++;
		} while (tentativas < 6);

		
	}
	
	public static String retornaLetra(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma letra qualquer: ");
		String letra = scan.next();
		return letra;
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
	
	public static int checaLetra (int pos, String letra, String palavra) {
		
		for (int i = pos; i < palavra.length(); i++) {
			if (palavra.substring(i, i+1).equals(letra)) {
				pos = i + 1;
				System.out.print(letra);
				return pos;
			}
			else {
				System.out.print("_ ");
			}
			
		}
		
		return 0;
	}
}
