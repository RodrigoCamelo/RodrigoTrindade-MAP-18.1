package br.cesed.unifacisa.si.map.exercicio.classes;

import br.cesed.unifacisa.si.map.exercicio.interfaces.NumeroPersonalizado;

public class NumeroComParenteses implements NumeroPersonalizado{

	private NumeroPersonalizado numeroParentese;
	
	public NumeroComParenteses(NumeroPersonalizado numeroParentese) {
		super();
		this.numeroParentese = numeroParentese;
	}

	@Override
	public String getNumeroPersonalizado() {
		return "(" + numeroParentese.getNumeroPersonalizado() + ")";
	}
}
