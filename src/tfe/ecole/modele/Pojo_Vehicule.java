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
public class Pojo_Vehicule {
    
    
private String numerochassis;
private String immatriculation;
private Date dateAchat;
private Date garantieExpire;
private int kmActuel;
private int kmfinCirculation;
private int KmInitial;
private int nbplaces;
private int prixAchat;
private int puissance;
private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


 
private int fk_idetatvehicule;
private int fk_idfournisseur;
private int fk_idmodele;
private int fk_idtypevehicule;

    public void setFk_idetatvehicule(int fk_idetatvehicule) {
        this.fk_idetatvehicule = fk_idetatvehicule;
    }

    public void setFk_idfournisseur(int fk_idfournisseur) {
        this.fk_idfournisseur = fk_idfournisseur;
    }

    public void setFk_idmodele(int fk_idmodele) {
        this.fk_idmodele = fk_idmodele;
    }

    public void setFk_idtypevehicule(int fk_idtypevehicule) {
        this.fk_idtypevehicule = fk_idtypevehicule;
    }

    public int getFk_idetatvehicule() {
        return fk_idetatvehicule;
    }

    public int getFk_idfournisseur() {
        return fk_idfournisseur;
    }

    public int getFk_idmodele() {
        return fk_idmodele;
    }

    public int getFk_idtypevehicule() {
        return fk_idtypevehicule;
    }

 
 private String Carburant ;
private ArrayList <Pojo_HistoriqueCarte> lesHisto;
private Pojo_Marque lesmarques;
private Pojo_Modele lesmodeles;
private Pojo_Etat lesetats;


private Pojo_Fournisseur lesfournisseurs;
 
    public void setKmActuel(int kmActuel) {
        this.kmActuel = kmActuel;
    }

    public void setLesHisto(ArrayList<Pojo_HistoriqueCarte> lesHisto) {
        this.lesHisto = lesHisto;
    }

    public void setLesmarques(Pojo_Marque lesmarques) {
        this.lesmarques = lesmarques;
    }

    public void setLesmodeles(Pojo_Modele lesmodeles) {
        this.lesmodeles = lesmodeles;
    }

    public void setLesetats(Pojo_Etat lesetats) {
        this.lesetats = lesetats;
    }

 

    public void setLesfournisseurs(Pojo_Fournisseur lesfournisseurs) {
        this.lesfournisseurs = lesfournisseurs;
    }

    public int getKmActuel() {
        return kmActuel;
    }

    public ArrayList<Pojo_HistoriqueCarte> getLesHisto() {
        return lesHisto;
    }

    public Pojo_Marque getLesmarques() {
        return lesmarques;
    }

    public Pojo_Modele getLesmodeles() {
        return lesmodeles;
    }

    public Pojo_Etat getLesetats() {
        return lesetats;
    }

   
    public Pojo_Fournisseur getLesfournisseurs() {
        return lesfournisseurs;
    }


    public void setNumerochassis(String numerochassis) {
        this.numerochassis = numerochassis;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public void setKmInitial(int KmInitial) {
        this.KmInitial = KmInitial;
    }

    public void setKmfinCirculation(int kmfinCirculation) {
        this.kmfinCirculation = kmfinCirculation;
    }

    public void setGarantieExpire(Date garantieExpire) {
        this.garantieExpire = garantieExpire;
    }

 
    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }


   
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setCarburant(String Carburant) {
        this.Carburant = Carburant;
    }
 

    public String getNumerochassis() {
        return numerochassis;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public int getPrixAchat() {
        return prixAchat;
    }

    public int getKmInitial() {
        return KmInitial;
    }

    public int getKmfinCirculation() {
        return kmfinCirculation;
    }

    public Date getGarantieExpire() {
        return garantieExpire;
    }



    public int getNbplaces() {
        return nbplaces;
    }

  

 

    public int getPuissance() {
        return puissance;
    }

    public String getCarburant() {
        return Carburant;
    }
 
 

    
}
