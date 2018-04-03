package br.unifacisa.si.map.classes;

import br.unifacisa.si.map.adapter.ImagemAdapter;
import br.unifacisa.si.map.interfaces.Imagem;

public class Cliente {
	
	public static void main(String[] args) {
		
		ImagemAdapter img = new ImagemAdapter();
		Imagem png = new ImagemPNG();
		Imagem BMP = new ImagemBMP();
		Imagem Jpeg = new ImagemJpeg();
		img.carregarImagem(png);
		img.desenharImagem(BMP);
		
	}

}
