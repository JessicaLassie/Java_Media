/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jl.daos;

import fr.jl.entities.Acteur;
import java.sql.Connection;

/**
 *
 * @author Jessica
 */
public class ActeurDAOTests {
    
    public static void main(String[] args) {
        Connection cnx = Connexion.getConnexionMySQL("mysql-kica.alwaysdata.net", "kica_mediatheque", "3306", "kica_root", "root");
        ActeurDAO dao = new ActeurDAO(cnx);
        Acteur resultatActeur = dao.selectOne("Alain Chabat");
        System.out.println(resultatActeur);
    }
}
