package br.com.glandata;

public class Pilha {

	public static void main(String[] args) {

		System.out.println("Início do método main");

		try {
			metodo1(5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Fim do método main");

	}

	private static void metodo1(int imposto) throws Exception {

		System.out.println("Início do método 1");

		if (imposto < 5) {
			Exception exception = new Exception("O valor tem que ser maior que 5");
			throw exception;
		}

		metodo2();

		System.out.println("Fim do método 1");

	}

	private static void metodo2() {

		System.out.println("Início do método 2");

		try {
			int numero = 4;
			System.out.println("Número recebido dividido por dois: " + numero / 2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		for (int i = 0; i <= 5; i++) {
			System.out.println("O valor de i é: " + i);
		}

		System.out.println("Fim do método 2");

	}

}
