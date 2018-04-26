package brcesed.unifacisa.si.map.app;

import brcesed.unifacisa.si.map.classes.Funcionario;
import brcesed.unifacisa.si.map.classes.Venda;
import brcesed.unifacisa.si.map.enums.Cargos;

public class main {


	public static void main(String[] args) {

		Funcionario gerente = new Funcionario("Fish", Cargos.GERENTE);
		Funcionario vendedor = new Funcionario("Ball", Cargos.VENDEDOR);
		Funcionario atendente = new Funcionario("Cat", Cargos.ATENDENTE);

		Venda venda1 = new Venda(3000., gerente);
		venda1.save();
		System.out.println(gerente.getComissao());

		Venda venda2 = new Venda(2000., vendedor);
		venda2.save();
		System.out.println(vendedor.getComissao());

		Venda venda3 = new Venda(1000., atendente);
		venda3.save();
		System.out.println(atendente.getComissao());
	}
}
