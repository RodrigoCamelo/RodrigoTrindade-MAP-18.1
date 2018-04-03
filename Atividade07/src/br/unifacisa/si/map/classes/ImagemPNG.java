package br.unifacisa.si.map.classes;

import br.unifacisa.si.map.interfaces.Imagem;

public class ImagemPNG implements Imagem {

	@Override
	public void carregarImagem() {
		System.out.println("Carregando a Imagem em PNG");
	}

	@Override
	public void desenharImagem() {
		System.out.println("Desenhado a Imagem em PNG");
	}

}
