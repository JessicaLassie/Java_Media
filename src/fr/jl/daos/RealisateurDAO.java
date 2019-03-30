package fr.jl.daos;

import fr.jl.entities.Realisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jessica
 */
public class RealisateurDAO {
    
    private Connection cnx;
    
    public RealisateurDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    // SELECT ONE
    public Realisateur selectOne(String realisateur) {
        Realisateur r = new Realisateur();
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL realisateurSelectOne(?)");
            lpst.setString(1, realisateur);
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                r.setIdRealisateur(lrs.getInt("id_realisateur"));
            } else {
                System.out.println("Réalisateur non trouvé");
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return r;
    }
    
    // SELECT ALL
    public List<Realisateur> selectAll() {
        List<Realisateur> listeRealisateur = new ArrayList();
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL realisateurSelectAll()");
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                Realisateur r = new Realisateur();
                r.setNomRealisateur(lrs.getString(1));
                listeRealisateur.add(r);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listeRealisateur;
    }
    
    // INSERT
    public boolean insert(Realisateur objet) {
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL realisateurInsert(?)");
            lpst.setString(1, objet.getNomRealisateur());
            lpst.executeUpdate();
            lpst.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    // UPDATE
    public boolean update(Realisateur objet) {
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL realisateurUpdate(?,?)");
            lpst.setString(1, objet.getNomRealisateur());
            lpst.setInt(2, objet.getIdRealisateur());
            lpst.executeUpdate();
            lpst.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }    
    }
    
    // DELETE
    public boolean delete(Realisateur objet) {
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL realisateurDelete(?)");
            lpst.setString(1, objet.getNomRealisateur());
            lpst.executeUpdate();
            lpst.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
