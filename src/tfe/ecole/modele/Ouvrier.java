/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hicham
 */
public class Ouvrier {

    public Ouvrier() {
    }
     private ArrayList<Documents> lesdocuments;

    public long getId() {
        return id;
    }

    public String getNomOuvrier() {
        return nomOuvrier;
    }

    public String getPrenomOuvrier() {
        return prenomOuvrier;
    }

    public Date getDatedenaissance() {
        return datedenaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public long getCodepostale() {
        return codepostale;
    }

    public String getVille() {
        return ville;
    }

    public int getNumTelephone() {
        return numTelephone;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateProchaineVisite() {
        return DateProchaineVisite;
    }

    public Date getDateExpirationCarteConducteur() {
        return dateExpirationCarteConducteur;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNomOuvrier(String nomOuvrier) {
        this.nomOuvrier = nomOuvrier;
    }

    public void setPrenomOuvrier(String prenomOuvrier) {
        this.prenomOuvrier = prenomOuvrier;
    }

    public void setDatedenaissance(Date datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodepostale(long codepostale) {
        this.codepostale = codepostale;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setNumTelephone(int numTelephone) {
        this.numTelephone = numTelephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateProchaineVisite(Date DateProchaineVisite) {
        this.DateProchaineVisite = DateProchaineVisite;
    }

    public void setDateExpirationCarteConducteur(Date dateExpirationCarteConducteur) {
        this.dateExpirationCarteConducteur = dateExpirationCarteConducteur;
    }
    
    
    
    private long id;
    private String nomOuvrier;
    private String prenomOuvrier;
    private Date datedenaissance;
    private String adresse;
    private long codepostale;
    private String ville;
    private int numTelephone;
    private String email;
    private Date DateProchaineVisite;
    private Date dateExpirationCarteConducteur;

  
}
