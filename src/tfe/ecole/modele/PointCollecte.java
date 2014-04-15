/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

/**
 *
 * @author hicham
 */
public class PointCollecte {
    
    
    private int idPointCollecte;
    private String nom;
    private float qtMoyenne;
    private String adresse;

    public PointCollecte() {
    }

    public int getIdPointCollecte() {
        return idPointCollecte;
    }

    public String getNom() {
        return nom;
    }

    public float getQtMoyenne() {
        return qtMoyenne;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setIdPointCollecte(int idPointCollecte) {
        this.idPointCollecte = idPointCollecte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQtMoyenne(float qtMoyenne) {
        this.qtMoyenne = qtMoyenne;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
    
    
    
    
    
    
    
    
}
