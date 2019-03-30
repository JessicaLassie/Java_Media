package fr.jl.entities;

/**
 *
 * @author Jessica
 */
public class Etat {
    
    private int idEtat;
    private String libelleEtat;
    
    //*****CONSTRUCTEURS*****//
    
    // Vide
    public Etat() {
    }

    // Plein

    public Etat(int idEtat, String libelleEtat) {
        this.idEtat = idEtat;
        this.libelleEtat = libelleEtat;
    }

    // Colonnes obligatoires
    // Identique au plein
    
    // Colonnes obligatoires sans la clé primaire
    public Etat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    //*****GETTERS ET SETTERS*****//
    public int getIdEtat() {
        return idEtat;
    }

    public void setIdEtat(int idEtat) {    
        this.idEtat = idEtat;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }
    
    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    //*****AUTRES*****//
    @Override
    public String toString() {
        return "Etat{" + "idEtat=" + idEtat + ", libelleEtat=" + libelleEtat + '}';
    }
    
    

}
