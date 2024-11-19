package tn.essat.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essat.model.Categorie;
import tn.essat.model.Produit;


public class GestionImp implements IGestion {

	private Connection cnx;
	
	public GestionImp() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			this.cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/magasindb","Sofiene","9590");
		}catch (Exception e) {
		
		}
	}
	
	@Override
	public List<Categorie> getAllCategorie() {
		List<Categorie> ListCategorie = new ArrayList<Categorie>();
		try {
			PreparedStatement pre = this.cnx.prepareStatement("select * from categorie");
			
			ResultSet res=pre.executeQuery();
			
			while(res.next()) {
				int id=res.getInt("id");
				String titre=res.getString("titre");
				Categorie cat = new Categorie (id,titre);
				ListCategorie.add(cat);
			}
		}catch (Exception e) {
			
			} 
		return ListCategorie;
	
	}

	@Override
	public void addCategorie(Categorie cat) {
		try {
			
			PreparedStatement pre = this.cnx.prepareStatement("INSERT INTO categorie VALUES (null,?)");
			pre.setString(1, cat.getCategorie());			
			pre.executeUpdate();

		} catch (Exception e) {

		}
		
	}

	@Override
	public void deleteCategorie(int id) {
		try {
			PreparedStatement pre = this.cnx.prepareStatement("DELETE FROM categorie WHERE id =?");
			pre.setInt(1, id);
			pre.executeUpdate();

		} catch (SQLException e) {
			
		}
		
	}

	@Override
	public List<Produit> getAllProduitsByCat(int cat_id) {
		List<Produit> ListCategorie = new ArrayList<Produit>();
		try {
			PreparedStatement pre = this.cnx.prepareStatement("select * from produit where cat_id=?");
			pre.setInt(1, cat_id);
			ResultSet res=pre.executeQuery();
			
			while(res.next()) {
				Produit prod = new Produit(res.getInt("id"),res.getString("titre"),res.getFloat("prix"),getCategorieById(res.getInt("cat_id")));
				ListCategorie.add(prod);
			}
		}catch (Exception e) {
			
			} 
		return ListCategorie;
	
	}

	@Override
	public void addProduit(Produit prod) {
		try {
			
			PreparedStatement pre = this.cnx.prepareStatement("INSERT INTO produit VALUES (null,?,?,?)");
			pre.setString(1, prod.getTitre());
			pre.setFloat(2, prod.getPrix());
			pre.setInt(3, prod.getCat().getId());
			pre.executeUpdate();

		} catch (Exception e) {

		}
		
	}

	@Override
	public void deleteProduit(int id) {
		try {
			PreparedStatement pre = this.cnx.prepareStatement("DELETE FROM produit WHERE id =?");
			pre.setInt(1, id);
			pre.executeUpdate();

		} catch (SQLException e) {
			
		}
		
	}

	@Override
	public Categorie getCategorieById(int id) {
		Categorie c= null;
		try {
			PreparedStatement pre = this.cnx.prepareStatement("select * from categorie where id =?");
			pre.setInt(1, id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				c= new Categorie(res.getInt("id"), res.getString("titre"));
			}
		} catch (Exception e) {

		}
		return c;
	}

}
