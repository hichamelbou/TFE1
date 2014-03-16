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
public class Entretien {
    private int idEntretien;
    private String Libelle;
    private  Date dateDernierEntretien;
    private Date dateProchaineEntretien;
    private int KmDernierEntretien;
    private int ProchaineEntretien;

    public Entretien() {
    }

    public int getIdEntretien() {
        return idEntretien;
    }

    public String getLibelle() {
        return Libelle;
    }

    public Date getDateDernierEntretien() {
        return dateDernierEntretien;
    }

    public Date getDateProchaineEntretien() {
        return dateProchaineEntretien;
    }

    public int getKmDernierEntretien() {
        return KmDernierEntretien;
    }

    public int getProchaineEntretien() {
        return ProchaineEntretien;
    }

    public void setIdEntretien(int idEntretien) {
        this.idEntretien = idEntretien;
    }

    public void setLibelle(String Libelle) {
        this.Libelle = Libelle;
    }

    public void setDateDernierEntretien(Date dateDernierEntretien) {
        this.dateDernierEntretien = dateDernierEntretien;
    }

    public void setDateProchaineEntretien(Date dateProchaineEntretien) {
        this.dateProchaineEntretien = dateProchaineEntretien;
    }

    public void setKmDernierEntretien(int KmDernierEntretien) {
        this.KmDernierEntretien = KmDernierEntretien;
    }

    public void setProchaineEntretien(int ProchaineEntretien) {
        this.ProchaineEntretien = ProchaineEntretien;
    }
    
    
    
}
