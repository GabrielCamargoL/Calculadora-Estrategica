package io;

import java.util.Scanner;

public class Entrada {
	private Scanner leitor;

	public Entrada() {
		leitor = new Scanner(System.in);
	}

	public double receberNumeroDouble() {
		double numero = leitor.nextDouble();
		return numero;
	}

	public double[] receberDoisNumeros() {
		double n1 = leitor.nextDouble();
		double n2 = leitor.nextDouble();
		double[] valores = { n1, n2 };
		return valores;
	}

	public int receberNumeroInteiro() {
		int numero = leitor.nextInt();
		return numero;
	}

	public String receberTexto() {
		String texto = leitor.nextLine();
		return texto;
	}

	@Override
	protected void finalize() throws Throwable {
		leitor.close();
	}
}
