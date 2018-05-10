package br.cesed.unifacisa.si.map.atividade;

public class Filho implements Familia{

	private String nome;
	private int idade;
	private Pai pai;
	private String email;
	
	@Override
	public String dados() {
		return ("Nome: " + nome + " Idade: " + idade + " Email: " + email);
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void mostraDados(Familia menbro) {
		System.out.println(menbro.dados());
	}
}
