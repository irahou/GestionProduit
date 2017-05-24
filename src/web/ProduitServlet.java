package web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ProduitMetier;
import metier.ProduitsMetier;

public class ProduitServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recuperer les infos
		String nom = req.getParameter("nom");
		String desc = req.getParameter("desc");
		String prix = req.getParameter("prix");
		String etat = req.getParameter("etat");
		ProduitMetier p = new ProduitMetier(1l, nom, desc, Integer.parseInt(prix), Integer.parseInt(etat));
		ProduitsMetier ps = new ProduitsMetier();
		ps.addProduit(p);
		ProduitBean pb = new ProduitBean();
		pb.setListe(ps.getAll());
		req.setAttribute("model", pb);
		req.getRequestDispatcher("Produit.jsp").forward(req, resp);
		
		// afficher les infos
		/*PrintWriter pw = resp.getWriter();
		pw.println("<html><head><title>le Produit et Ajouter</title></head><body>");
		pw.println("Nom : "+ nom +" Description: "+ desc + " Prix: "+ prix + " Etat: " + etat);
		pw.println("</body></html>");*/
	}
}
