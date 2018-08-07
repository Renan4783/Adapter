package br.unicentro.acaddecomp;

import java.util.Random;

public class DadoNormal implements Dado {

	private int face;
	
	@Override
	public void jogaDado() {
		Random rn = new Random();
		int range = 6 - 1 + 1;
		face = rn.nextInt(range) + 1;
	}

	@Override
	public int lerFace() {
		return face;
	}

}
