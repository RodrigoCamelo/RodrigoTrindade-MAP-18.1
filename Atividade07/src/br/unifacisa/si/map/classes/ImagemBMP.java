package br.unifacisa.si.map.classes;

import br.unifacisa.si.map.interfaces.Imagem;

public class ImagemBMP implements Imagem {

	@Override
	public void carregarImagem() {
		System.out.println("Carregando a Imagem em BMP");		
	}

	@Override
	public void desenharImagem() {
		System.out.println("Desenhado a Imagem em BMP");
	}

}
