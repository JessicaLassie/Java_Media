package fr.jl.entities;

/**
 *
 * @author Jessica
 */
public class Film {
    
    private int idFilm;
    private String titreFilm;
    private String nomRealisateur;
    private String nomActeur;
    private String libelleGenre;
    private int annee;
    private String duree;
    private String libelleSupport;
    private String nomProprietaire;
    private String libelleEtat;
    private String commentaire;
    
    //*****CONSTRUCTEURS*****//
    
    // Vide
    public Film() {
    }
    
    // Plein
    public Film(int idFilm, String titreFilm, String nomRealisateur, String nomActeur, String libelleGenre, int annee, String duree, String libelleSupport, String nomProprietaire, String libelleEtat, String commentaire) {
        this.idFilm = idFilm;
        this.titreFilm = titreFilm;
        this.nomRealisateur = nomRealisateur;
        this.nomActeur = nomActeur;
        this.libelleGenre = libelleGenre;
        this.annee = annee;
        this.duree = duree;
        this.libelleSupport = libelleSupport;
        this.nomProprietaire = nomProprietaire;
        this.libelleEtat = libelleEtat;
        this.commentaire = commentaire;
    }
    
    // Colonnes obligatoires
    public Film(int idFilm, String titreFilm, String nomRealisateur, String nomActeur, String libelleGenre, int annee, String duree, String libelleSupport, String nomProprietaire, String libelleEtat) {
        this.idFilm = idFilm;
        this.titreFilm = titreFilm;
        this.nomRealisateur = nomRealisateur;
        this.nomActeur = nomActeur;
        this.libelleGenre = libelleGenre;
        this.annee = annee;
        this.duree = duree;
        this.libelleSupport = libelleSupport;
        this.nomProprietaire = nomProprietaire;
        this.libelleEtat = libelleEtat;
    }
    
    // Colonnes obligatoires sans la clé primaire
    public Film(String titreFilm, String nomRealisateur, String nomActeur, String libelleGenre, int annee, String duree, String libelleSupport, String nomProprietaire, String libelleEtat) {
        this.titreFilm = titreFilm;
        this.nomRealisateur = nomRealisateur;
        this.nomActeur = nomActeur;
        this.libelleGenre = libelleGenre;
        this.annee = annee;
        this.duree = duree;
        this.libelleSupport = libelleSupport;
        this.nomProprietaire = nomProprietaire;
        this.libelleEtat = libelleEtat;
    }
    
    //*****GETTERS ET SETTERS*****//

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitreFilm() {
        return titreFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String idRealisateur) {
        this.nomRealisateur = idRealisateur;
    }

    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    public String getLibelleGenre() {
        return libelleGenre;
    }

    public void setLibelleGenre(String libelleGenre) {
        this.libelleGenre = libelleGenre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLibelleSupport() {
        return libelleSupport;
    }

    public void setLibelleSupport(String idSupport) {
        this.libelleSupport = libelleSupport;
    }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }

    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
    //*****AUTRES*****//

    @Override
    public String toString() {
        return "Films{" + "idFilm=" + idFilm + ", titreFilm=" + titreFilm + ", nomRealisateur=" + nomRealisateur + ", nomActeur=" + nomActeur + ", libelleGenre=" + libelleGenre + ", annee=" + annee + ", duree=" + duree + ", libelleSupport=" + libelleSupport + ", nomProprietaire=" + nomProprietaire + ", libelleEtat=" + libelleEtat + ", commentaire=" + commentaire + '}';
    } 
    
}
