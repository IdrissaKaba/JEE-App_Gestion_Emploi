package tn.essat.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tn.essat.dao.GestionImp;
import tn.essat.dao.IGestion;
import tn.essat.model.Categorie;
import tn.essat.model.Produit;

/**
 * Servlet implementation class AddProduct
 */
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titre=request.getParameter("titre");
		float prix = Float.parseFloat(request.getParameter("prix"));
		int idc=Integer.parseInt(request.getParameter("cat"));
		
		IGestion dao = new GestionImp();
		
		Categorie c = dao.getCategorieById(idc);
		
		Produit p= new Produit();
		p.setTitre(titre);
		p.setPrix(prix);
		p.setCat(c);
		dao.addProduit(p);
		
		request.getRequestDispatcher("PreProduit?idc="+idc).forward(request, response);
		
	}

}
