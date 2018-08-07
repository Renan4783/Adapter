package br.unicentro.acaddecomp;

public class AdapterDadoViciado implements Dado{
	
	private DadoViciado d1;
	private int face;

	@Override
	public void jogaDado() {
		d1 = new DadoViciado();
		face = d1.joga();
	}

	@Override
	public int lerFace() {
		return face;
	}

}
