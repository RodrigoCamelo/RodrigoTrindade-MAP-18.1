package br.cesed.unifacisa.si.map.exercicio.classes;

import br.cesed.unifacisa.si.map.exercicio.interfaces.NumeroPersonalizado;

public class NumeroComChaves implements NumeroPersonalizado {
	
	private NumeroPersonalizado numeroChave;
	
	public NumeroComChaves(NumeroPersonalizado numeroChave) {
		super();
		this.numeroChave = numeroChave;
	}
	
	@Override
	public String getNumeroPersonalizado() {
		return "{" + numeroChave.getNumeroPersonalizado() + "}";
	}
}
