package tn.essat.dao;

import java.util.List;

import tn.essat.model.Categorie;
import tn.essat.model.Produit;

public interface IGestion {
	
	public List<Categorie> getAllCategorie();
	public void addCategorie(Categorie cat);
	public void deleteCategorie(int id);
	
	public List<Produit> getAllProduitsByCat(int cat_id);
	public void addProduit(Produit prod);
	public void deleteProduit(int id);
	
	public Categorie getCategorieById(int id);
}
