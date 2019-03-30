package fr.jl.entities;

/**
 *
 * @author Jessica
 */
public class Acteur {
    
    private int idActeur;
    private String nomActeur;
    
    //*****CONSTRUCTEURS*****//
    
    // Vide
    public Acteur() {
    }
    
    // Plein
    public Acteur(int idActeur, String nomActeur) {
        this.idActeur = idActeur;
        this.nomActeur = nomActeur;
    }
    
    // Colonnes obligatoires
    // Identique au plein
   
    // Colonnes obligatoires sans la clé primaire
    public Acteur(String nomActeur) {
        this.nomActeur = nomActeur;
    }
    
    //*****GETTERS ET SETTERS*****//

    public int getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(int idActeur) {
        this.idActeur = idActeur;
    }

    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    //*****AUTRES*****//

    @Override
    public String toString() {
        return "Acteur{" + "idActeur=" + idActeur + ", nomActeur=" + nomActeur + '}';
    }

}
