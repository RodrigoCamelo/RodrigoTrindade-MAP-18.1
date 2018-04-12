package br.cesed.unifacisa.si.map.exercicio.classes;

public class Numero {

	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return String.valueOf(numero);
	}
}
