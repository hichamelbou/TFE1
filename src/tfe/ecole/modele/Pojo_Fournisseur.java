/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

/**
 *
 * @author hicham
 */
public class Pojo_Fournisseur {
    private int idFournisseur;
   
    private String adresse;
    private String ville;
    private String Pays;
    private int codePostale;

   
    private int telephone;

  
    private String mail;
    private String nom;
    private String note;
    private int idCategorie;

    public Pojo_Fournisseur() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
 public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }
   public int getIdCategorie() {
        return idCategorie;
    }
    public int getIdFournisseur() {
        return idFournisseur;
    }

 

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return Pays;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getMail() {
        return mail;
    }

    public String getNote() {
        return note;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

 
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public void setCodePostale(int codePostale) {
        this.codePostale = codePostale;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
