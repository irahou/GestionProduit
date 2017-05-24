package metier;

public class ProduitMetier {

	private long id;
	private String nom,desc;
	private int prix,etat;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public ProduitMetier() {
		super();
	}
	public ProduitMetier(String nom, String desc, int prix, int etat) {
		super();
		this.nom = nom;
		this.desc = desc;
		this.prix = prix;
		this.etat = etat;
	}
	public ProduitMetier(long id, String nom, String desc, int prix, int etat) {
		super();
		this.id = id;
		this.nom = nom;
		this.desc = desc;
		this.prix = prix;
		this.etat = etat;
	}
	@Override
	public String toString() {
		// TODO Stub de la méthode généré automatiquement
		return "Nom : "+ nom +" Description: "+ desc + " Prix: "+ prix + " Etat: " + etat;
	}
	
	public void Show(){
		System.out.println(toString());
	}
}
