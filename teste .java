package br.com.senai.teste;

public class nicolle {
	public static void main(String[] args) {
		
		String disciplina = "Sistemas Orientados a Objetos I";
		String disciplina_a = "programação de aplicativos";
		System.out.println("disciplina: " + disciplina);
		// Isolando um caractere:
		System.out.print("primeiro caractere: ");
		System.out.println(disciplina.charAt(0));
		System.out.print("segundo caractere: ");
		System.out.println(disciplina.charAt(1));
		// O primeiro caractere de uma String tem o
		// índice 0, o segundo o índice 1 e assim por diante
		// letra = 's';
		char letra = disciplina.charAt(2);
		// substrings:
		System.out.print("primeiras cinco letras: ");
		System.out.println(disciplina_a.substring(0, 5));
		System.out.print("letras a partir da quarta: ");
		System.out.println(disciplina.substring(4));
		System.out.print("tamanho da frase: ");
		System.out.println(disciplina.length() + " letras");
		// usando os caracteres de tabulação e quebra
		// de linha:
		System.out.println(""+ disciplina.length()+ " letras"+ " \n"+ " Nova linha\ttabulação");
		
		System.out.print("primeiras sete letras da variavel_a");
		System.out.print(disciplina_a.substring(0,7));
	}
	}