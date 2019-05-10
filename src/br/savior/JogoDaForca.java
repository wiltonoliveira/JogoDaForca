package br.savior;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		inicio();
	}
	
	public static void inicio(){
		traco(palavraOculta());
		//System.out.println(retornaLetra());
		int pos = 0;
		
		System.out.println(checaLetra(pos, retornaLetra(), palavraOculta()));
	}
	
	public static String retornaLetra(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma letra qualquer: ");
		String letra = scan.next();
		return letra;
	}
	
	public static String palavraOculta(){
		return "Democracia";
	}
	
	public static void traco (String palavra){
		for (int i = 0; i < palavra.length(); i++) {
			System.out.print("_ " + "");
			
		}
		System.out.println("\n");
	}
	
	public static int checaLetra (int pos, String letra, String palavra) {
		int let = letra.indexOf(letra);
		
		
		for (int i = pos; i < palavra.length(); i++) {
			if (let == palavra.indexOf(let)) {
				pos = i;
				return pos;
			}
		}
		return 0;
	}
}
