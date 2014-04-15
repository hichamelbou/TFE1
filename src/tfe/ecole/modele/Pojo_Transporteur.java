/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

import java.util.Date;

/**
 *
 * @author hicham
 */
public class Pojo_Transporteur {
    
   private int  idTransporteur;
   private String nom;
   private String prenom;
   private Date dateNaissance;
   private String adresse;
   private int codepostal;
   private String ville;
   private String telephone;
   private String email;
   private Date dateVisite;
   private Date dateexpiractionCartePro;
   private Date  dateExpirationcap;

    public Pojo_Transporteur() {
    }

    public int getIdTransporteur() {
        return idTransporteur;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public String getVille() {
        return ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public Date getDateexpiractionCartePro() {
        return dateexpiractionCartePro;
    }

    public Date getDateExpirationcap() {
        return dateExpirationcap;
    }

    public void setIdTransporteur(int idTransporteur) {
        this.idTransporteur = idTransporteur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodepostal(int codepostal) {
        this.codepostal = codepostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public void setDateexpiractionCartePro(Date dateexpiractionCartePro) {
        this.dateexpiractionCartePro = dateexpiractionCartePro;
    }

    public void setDateExpirationcap(Date dateExpirationcap) {
        this.dateExpirationcap = dateExpirationcap;
    }
   
           
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
