package metier;

import java.util.Iterator;

public class TestMetier {
	public static void main(String[] args) {
		System.out.println("Test Couche Metier");
		ProduitsMetier ps = new ProduitsMetier();
		ProduitMetier p = new ProduitMetier(1L,"Pc","Portable",500,1);
		ps.addProduit(p);
		p = new ProduitMetier(2L,"tel","samsung",200,1);
		ps.addProduit(p);
		ps.removeProduit(2L);
		Iterator<ProduitMetier> produits = ps.getAll().iterator();
		while(produits.hasNext()){
			ProduitMetier pr =  produits.next();
			pr.Show();
		}
			
	}
}
