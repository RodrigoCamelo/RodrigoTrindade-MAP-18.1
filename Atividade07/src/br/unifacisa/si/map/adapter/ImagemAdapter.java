package br.unifacisa.si.map.adapter;

import br.unifacisa.si.map.interfaces.Imagem;
import br.unifacisa.si.map.interfaces.ImagemTarget;

public class ImagemAdapter implements ImagemTarget{

	@Override
	public void carregarImagem(Imagem img) {
		img.carregarImagem();
	}

	@Override
	public void desenharImagem(Imagem img) {
		img.desenharImagem();
	}
}
