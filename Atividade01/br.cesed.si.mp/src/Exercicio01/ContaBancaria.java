package Exercicio01;

public class ContaBancaria {

	private int agencia;
	private int conta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	public ContaBancaria(int agencia, int conta, String titular, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void sacar(double valor){
		if(saldo >= valor){
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor){
		if(valor > 0){
			saldo += valor;
		}
	}
	
	public double obterSaldo(){
		return this.saldo;
	}
	
}
