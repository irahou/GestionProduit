package metier;

import java.util.ArrayList;
import java.util.Iterator;

public class ProduitsMetier {
	
	private ArrayList<ProduitMetier> produits = new ArrayList<>();

	public ArrayList<ProduitMetier> getProduits() {
		return produits;
	}

	public void setProduits(ArrayList<ProduitMetier> produits) {
		this.produits = produits;
	}
	
	public void addProduit(ProduitMetier p){
		produits.add(p);
	}
	public void removeProduit(long id){
		for (ProduitMetier p : produits) {
			if(p.getId() == id){
				produits.remove(p);
				break;
			}
		}
	}
	public ArrayList getAll(){
		return produits;
	}
}
