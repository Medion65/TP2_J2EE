package fr.david.tp2.servlets;

import java.io.IOException;

import fr.david.tp2.beans.Utilisateurs;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreationUtilisateurs extends HttpServlet
{
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        String nom = request.getParameter( "nomUtilisateur" );
        String prenom = request.getParameter( "prenomUtilisateur" );
        String email = request.getParameter( "emailUtilisateur" );

        Utilisateurs utilisateur = new Utilisateurs();
        utilisateur.setNom( nom );
        utilisateur.setPrenom( prenom );
        utilisateur.setEmail( email );

        request.setAttribute( "utilisateur", utilisateur );
        

    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/creerUtilisateurs.jsp" ).forward( request, response );
    }

}