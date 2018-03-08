package Exercicio02;

import Interface.ContaBancaria;

public class ContaCorrente implements ContaBancaria{
	
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	private String cpf;
	
	public ContaCorrente(int agencia, int conta, double saldo, String titular, String cpf) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.titular = titular;
		this.cpf = cpf;
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

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void saque(double montante) {

		if (montante <= saldo) {
			saldo -= montante;
		} else {
			System.out.println("Valor inválido");
		}
	}

	public void deposito(double montante) {

		if (montante > 0) {
			saldo += montante;
		} else {
			System.out.println("Valor insuficiente ou inválido para depósito");
		}
	}

	public double saldo() {

		System.out.println("O saldo seu é:");
		return saldo;

	}
}
