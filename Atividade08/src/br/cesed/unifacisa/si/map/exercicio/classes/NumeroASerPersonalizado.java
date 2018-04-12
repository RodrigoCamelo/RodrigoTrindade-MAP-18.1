package br.cesed.unifacisa.si.map.exercicio.classes;

import br.cesed.unifacisa.si.map.exercicio.interfaces.NumeroPersonalizado;

public class NumeroASerPersonalizado implements NumeroPersonalizado{

	private Numero numero;
	
	public NumeroASerPersonalizado(Numero numero) {
		super();
		this.numero = numero;
	}



	@Override
	public String getNumeroPersonalizado() {
		return this.numero.toString();
	}

}
