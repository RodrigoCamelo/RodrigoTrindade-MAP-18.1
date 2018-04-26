package brcesed.unifacisa.si.map.classes;

public class Venda {
	
	private double valorVenda;
	private Funcionario funcionario;
	private double comissaoVenda;
	
	public Venda(double valorVenda, Funcionario funcionario) {
		super();
		this.valorVenda = valorVenda;
		this.funcionario = funcionario;
	}
	
	public double getVenda() {
		return valorVenda;
	}
	public void setVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public double getComissaoVenda() {
		return comissaoVenda;
	}
	public void setComissaoVenda(double comissaoVenda) {
		this.comissaoVenda = comissaoVenda;
	}
	
	public void save() {
        
        this.comissaoVenda = this.funcionario.getCargo().calcularComissao(this.valorVenda);
		this.funcionario.setComissao(this.funcionario.getComissao() + this.comissaoVenda);
    }
}
