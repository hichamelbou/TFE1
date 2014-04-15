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
public class Pojo_Documents {
    private int idDocument;
    private String libelle;
    private Date dateCreation;

    private Date dateExpiration;
    private int idfournisseur;
    private String idvehicule;
    private int idtypedoc;

    public int getIdfournisseur() {
        return idfournisseur;
    }

    public String getIdvehicule() {
        return idvehicule;
    }

    public int getIdtypedoc() {
        return idtypedoc;
    }

    public void setIdfournisseur(int idfournisseur) {
        this.idfournisseur = idfournisseur;
    }

    public void setIdvehicule(String idvehicule) {
        this.idvehicule = idvehicule;
    }

    public void setIdtypedoc(int idtypedoc) {
        this.idtypedoc = idtypedoc;
    }
          

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      public Date getDateCreation() {
        return dateCreation;
    }
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    private int Montant;
    private String note;
    private Pojo_Vehicule lesvehicules; 

    public Pojo_Vehicule getLesvehicules() {
        return lesvehicules;
    }

    public void setLesvehicules(Pojo_Vehicule lesvehicules) {
        this.lesvehicules = lesvehicules;
    }
    

    public Pojo_Documents() {
    }

    public int getIdDocument() {
        return idDocument;
    }

    public String getLibelle() {
        return libelle;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public int getMontant() {
        return Montant;
    }

    public String getNote() {
        return note;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void setMontant(int Montant) {
        this.Montant = Montant;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    
    
    
    
    
    
    
    
}
