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
public class Pojo_Reparation {
    private int idReparation;
    private double cout;
    private Date datereparatiob;
    private String note;
    private int idtypeReparation;
    private String idVehicule;
    private int idFournisseur;

    public int getIdtypeReparation() {
        return idtypeReparation;
    }

    public String getIdVehicule() {
        return idVehicule;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdtypeReparation(int idtypeReparation) {
        this.idtypeReparation = idtypeReparation;
    }

    public void setIdVehicule(String idVehicule) {
        this.idVehicule = idVehicule;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }
    

    public Pojo_Reparation() {
    }

    public int getIdReparation() {
        return idReparation;
    }

    public double getCout() {
        return cout;
    }

    public Date getDatereparatiob() {
        return datereparatiob;
    }

    public String getNote() {
        return note;
    }

    public void setIdReparation(int idReparation) {
        this.idReparation = idReparation;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public void setDatereparatiob(Date datereparatiob) {
        this.datereparatiob = datereparatiob;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
