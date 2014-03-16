/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

/**
 *
 * @author hicham
 */
public class Fournisseur {
    private int idFournisseur;
    private String categorie;
    private String adresse;
    private String ville;
    private String Pays;
    private String codePostale;
    private int telephone;
    private String mail;
    private String note;

    public Fournisseur() {
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public String getCategorie() {
        return categorie;
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

    public String getCodePostale() {
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

    public void setCategorie(String categorie) {
        this.categorie = categorie;
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

    public void setCodePostale(String codePostale) {
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
