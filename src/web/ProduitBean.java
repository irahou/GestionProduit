package web;

import java.util.ArrayList;

import metier.ProduitMetier;

public class ProduitBean {
	
	private ProduitMetier p = new ProduitMetier();
	private ArrayList<ProduitMetier> vp = new ArrayList<ProduitMetier>() ;
	public ProduitMetier getP() {
		return p;
	}
	public void setP(ProduitMetier p) {
		this.p = p;
	}
	public ArrayList<ProduitMetier> getVp() {
		return vp;
	}
	public void setVp(ArrayList<ProduitMetier> vp) {
		this.vp = vp;
	}
	public void setListe(ArrayList all) {
		// TODO Stub de la méthode généré automatiquement
		this.vp = all;
	}
	
	
}
