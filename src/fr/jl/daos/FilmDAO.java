package fr.jl.daos;

import fr.jl.entities.Film;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jessica
 */
public class FilmDAO {
    
    private Connection cnx;
    
    public FilmDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    // SELECT ALL
    public List<Film> selectAll() {
        List<Film> listeFilm = new ArrayList();
        try {
            PreparedStatement lpst = cnx.prepareStatement("CALL filmSelectAll()");
            ResultSet lrs = lpst.executeQuery();
            while (lrs.next()) {
                Film f = new Film();
                f.setTitreFilm(lrs.getString(1));
                f.setNomRealisateur(lrs.getString(2));
                f.setNomActeur(lrs.getString(3));
                f.setLibelleGenre(lrs.getString(4));
                f.setAnnee(lrs.getInt(5));
                f.setDuree(lrs.getString(6));
                f.setLibelleSupport(lrs.getString(7));
                f.setNomProprietaire(lrs.getString(8));
                f.setLibelleEtat(lrs.getString(9));
                f.setCommentaire(lrs.getString(10));
                listeFilm.add(f);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listeFilm;
    }
    
}
