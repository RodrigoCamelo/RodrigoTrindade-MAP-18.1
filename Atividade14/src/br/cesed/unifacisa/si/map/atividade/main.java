package br.cesed.unifacisa.si.map.atividade;

public class main {
	
	public static void main(String[] args) {
		Pai pai = new Pai();
		pai.setNome("Joao");
		pai.setIdade(50);
		Filho filho = new Filho();
		filho.setNome("Carlos");
		filho.setIdade(20);
		filho.setEmail("carlos@teste.com");
		
		filho.mostraDados(pai);
		filho.mostraDados(filho);
	}

}
