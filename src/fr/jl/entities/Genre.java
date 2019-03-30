package fr.jl.entities;

/**
 *
 * @author Jessica
 */
public class Genre {
    
    private int idGenre;
    private String libelleGenre;
    
    //*****CONSTRUCTEURS*****//
    
    // Vide
    public Genre() {
    }

    // Plein

    public Genre(int idGenre, String libelleGenre) {
        this.idGenre = idGenre;
        this.libelleGenre = libelleGenre;
    }
    
    // Colonnes obligatoires
    // Identique au plein
    
    // Colonnes obligatoires sans la clé primaire

    public Genre(String libelleGenre) {
        this.libelleGenre = libelleGenre;
    }
    
    //*****GETTERS ET SETTERS*****//
    
    public void setLibelleGenre(String libelleGenre) {
        this.libelleGenre = libelleGenre;
    }
    
    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {    
        this.idGenre = idGenre;
    }

    public String getLibelleGenre() {
        return libelleGenre;
    }

    //*****AUTRES*****//
    @Override
    public String toString() {
        return "Genre{" + "idGenre=" + idGenre + ", libelleGenre=" + libelleGenre + '}';
    }

}
