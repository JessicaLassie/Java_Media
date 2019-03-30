package fr.jl.daos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jessica
 */
public class Connexion {

    // Methode de connexion à la BD
    public static Connection getConnexionMySQL(String serveur, String nomBd, String port, String utilisateur, String mdp) {
        Connection cnx = null;       
        try {
            String url = "jdbc:mysql://" + serveur + ":" + port + "/" + nomBd;
            cnx = DriverManager.getConnection(url, utilisateur, mdp);
            // Pas de commit automatique
            cnx.setAutoCommit(false);
        } catch (SQLException e) {
            // Affichage d'une boite de dialogue indiquant une erreur si la connexion n'est pas établie
            JOptionPane message;
            message = new JOptionPane();
            message.showMessageDialog(null, "Impossible de se connecter à la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        return cnx;
    }

    // Methode de deconnexion de la BD
    public static void seDeconnecter(Connection cnx) {
        try {
            cnx.close();
            cnx = null;
        } catch (SQLException e) {
        }
    }
}
