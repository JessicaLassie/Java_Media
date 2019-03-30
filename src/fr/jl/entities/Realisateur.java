package fr.jl.entities;

/**
 *
 * @author Jessica
 */
public class Realisateur {
    
    private int idRealisateur;
    private String nomRealisateur;
    
    //*****CONSTRUCTEURS*****//
    
    // Vide
    public Realisateur() {
    }
    
    // Plein
    public Realisateur(int idRealisateur, String nomRealisateur) {
        this.idRealisateur = idRealisateur;
        this.nomRealisateur = nomRealisateur;
    }
    
    // Colonnes obligatoires
    // Identique au plein
    
    // Colonnes obligatoires sans la clé primaire
    public Realisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }
    
    //*****GETTERS ET SETTERS*****//
    
    public int getIdRealisateur() {
        return idRealisateur;
    }

    public void setIdRealisateur(int idRealisateur) {
        this.idRealisateur = idRealisateur;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    //*****AUTRES*****//
    
    @Override
    public String toString() {
        return "Realisateur{" + "idRealisateur=" + idRealisateur + ", nomRealisateur=" + nomRealisateur + '}';
    }
    
}
