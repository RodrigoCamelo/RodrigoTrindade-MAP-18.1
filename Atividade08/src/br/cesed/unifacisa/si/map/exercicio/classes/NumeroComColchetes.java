package br.cesed.unifacisa.si.map.exercicio.classes;

import br.cesed.unifacisa.si.map.exercicio.interfaces.NumeroPersonalizado;

public class NumeroComColchetes implements NumeroPersonalizado {

	private NumeroPersonalizado numeroColchete;
	
	public NumeroComColchetes(NumeroPersonalizado numeroColchete) {
		super();
		this.numeroColchete = numeroColchete;
	}
	
	@Override
	public String getNumeroPersonalizado() {
		return "[" + numeroColchete.getNumeroPersonalizado() + "]";
	}
}
