package fr.jl.daos;

import java.sql.Connection;
import fr.jl.entities.Acteur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jessica
 */
public class ActeurDAO {
    
    private Connection cnx;
    
    public ActeurDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    // SELECT ONE
    public Acteur selectOne(String acteur) {
        Acteur a = new Acteur();
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL acteurSelectOne(?)");
            lpst.setString(1, acteur);
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                a.setIdActeur(lrs.getInt("id_acteur"));
            } else {
                System.out.println("Acteur non trouvé");
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return a;
    }

    // SELECT ALL
    public List<Acteur> selectAll() {
        List<Acteur> listeActeur = new ArrayList();
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL acteurSelectAll()");
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                Acteur a = new Acteur();
                a.setNomActeur(lrs.getString(1));
                listeActeur.add(a);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listeActeur;
    }
    
    // INSERT
    public boolean insert(Acteur objet) {
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL acteurInsert(?)");
            lpst.setString(1, objet.getNomActeur());
            lpst.executeUpdate();
            lpst.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    // UPDATE
    public boolean update(Acteur objet) {
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL acteurUpdate(?,?)");
            lpst.setString(1, objet.getNomActeur());
            lpst.setInt(2, objet.getIdActeur());
            lpst.executeUpdate();
            lpst.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }    
    }
    
    // DELETE
    public boolean delete(Acteur objet) {
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL acteurDelete(?)");
            lpst.setString(1, objet.getNomActeur());
            lpst.executeUpdate();
            lpst.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }   
    }
    
}
