package fr.jl.entities;

/**
 *
 * @author Jessica
 */
public class Support {
    
    private int idSupport;
    private String libelleSupport;
    
    //*****CONSTRUCTEURS*****//
    
    // Vide
    public Support() {
    }

    // Plein
    public Support(int idSupport, String libelleSupport) {
        this.idSupport = idSupport;
        this.libelleSupport = libelleSupport;
    }
    
    // Colonnes obligatoires
    // Identique au plein
    
    // Colonnes obligatoires sans la clé primaire
    public Support(String libelleSupport) {    
        this.libelleSupport = libelleSupport;
    }

    //*****GETTERS ET SETTERS*****//
    
    public int getIdSupport() {    
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public String getLibelleSupport() {
        return libelleSupport;
    }
    
    public void setLibelleSupport(String libelleSupport) {
        this.libelleSupport = libelleSupport;
    }

    //*****AUTRES*****//
    
    @Override
    public String toString() {
        return "Support{" + "idSupport=" + idSupport + ", libelleSupport=" + libelleSupport + '}';
    }
    
    
    

}
