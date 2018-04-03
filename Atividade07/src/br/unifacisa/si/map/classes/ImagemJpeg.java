package br.unifacisa.si.map.classes;

import br.unifacisa.si.map.interfaces.*;

public class ImagemJpeg implements Imagem {

	@Override
	public void carregarImagem() {
		System.out.println("Carregando a Imagem em Jpeg");
	}

	@Override
	public void desenharImagem() {
		System.out.println("Desenhado a Imagem em Jpeg");
	}
	
	
}
