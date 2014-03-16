/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

/**
 *
 * @author hicham
 */
public class Taches {
    
    
    private int idtaches;
    private int montant;
    private String note;
    private Vehicule lesvehicules;

    public Vehicule getLesvehicules() {
        return lesvehicules;
    }

    public void setLesvehicules(Vehicule lesvehicules) {
        this.lesvehicules = lesvehicules;
    }
    

    public Taches() {
    }

    public int getIdtaches() {
        return idtaches;
    }

    public int getMontant() {
        return montant;
    }

    public String getNote() {
        return note;
    }

    public void setIdtaches(int idtaches) {
        this.idtaches = idtaches;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
