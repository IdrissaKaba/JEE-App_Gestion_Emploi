package tn.essat.model;

public class Categorie {
	
	private int id;
	private String categorie;
	
	
	public Categorie(int id, String categorie) {
		super();
		this.id = id;
		this.categorie = categorie;
	}


	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
