package br.cesed.unifacisa.si.map.exercicio.main;

import br.cesed.unifacisa.si.map.exercicio.classes.Numero;
import br.cesed.unifacisa.si.map.exercicio.classes.NumeroASerPersonalizado;
import br.cesed.unifacisa.si.map.exercicio.classes.NumeroComChaves;
import br.cesed.unifacisa.si.map.exercicio.classes.NumeroComColchetes;
import br.cesed.unifacisa.si.map.exercicio.classes.NumeroComParenteses;
import br.cesed.unifacisa.si.map.exercicio.interfaces.NumeroPersonalizado;

public class App {

	public static void main(String[] args) {
		
		Numero num = new Numero(1);
		
		NumeroPersonalizado numeroPersonalizado = new NumeroASerPersonalizado(num);
		System.out.println(numeroPersonalizado.getNumeroPersonalizado());
		numeroPersonalizado = new NumeroComParenteses(numeroPersonalizado);
		numeroPersonalizado = new NumeroComColchetes(numeroPersonalizado);
		numeroPersonalizado = new NumeroComChaves(numeroPersonalizado);
		System.out.println(numeroPersonalizado.getNumeroPersonalizado());
	}
}
