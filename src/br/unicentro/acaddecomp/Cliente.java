package br.unicentro.acaddecomp;

public class Cliente {
	public static void main(String args[]){
		AdapterDadoViciado ad = new AdapterDadoViciado();
		ad.jogaDado();
		System.out.println(ad.lerFace());
		DadoNormal dn = new DadoNormal();
		dn.jogaDado();
		System.out.println(dn.lerFace());
	}
}
