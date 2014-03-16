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
public class Documents {
    private int idDocument;
    private String libelle;
    private Date dateExpiration;
    private int Montant;
    private String note;
    private Vehicule lesvehicules;

    public Vehicule getLesvehicules() {
        return lesvehicules;
    }

    public void setLesvehicules(Vehicule lesvehicules) {
        this.lesvehicules = lesvehicules;
    }
    

    public Documents() {
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
