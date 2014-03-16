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
public class Vehicule {
    
    
 private String numerochassis;
 private String immatriculation;
 private Date dateAchat;
 private int prixAchat;
 private int KmInitial;
 private int kmfinCirculation;
 private int kmActuel;
 private Date garantieExpire;
 private Date MiseenCirculation;
 private int nbplaces;
 private int capacite;
 private String type;
 private int puissance;
 private String Carburant ;
private ArrayList <HistoriqueCarte> lesHisto;
private Marque lesmarques;
private Modele lesmodeles;
private Etat lesetats;
private Permis lespermis;
private Fournisseur lesfournisseurs;
 
    public void setKmActuel(int kmActuel) {
        this.kmActuel = kmActuel;
    }

    public void setLesHisto(ArrayList<HistoriqueCarte> lesHisto) {
        this.lesHisto = lesHisto;
    }

    public void setLesmarques(Marque lesmarques) {
        this.lesmarques = lesmarques;
    }

    public void setLesmodeles(Modele lesmodeles) {
        this.lesmodeles = lesmodeles;
    }

    public void setLesetats(Etat lesetats) {
        this.lesetats = lesetats;
    }

    public void setLespermis(Permis lespermis) {
        this.lespermis = lespermis;
    }

    public void setLesfournisseurs(Fournisseur lesfournisseurs) {
        this.lesfournisseurs = lesfournisseurs;
    }

    public int getKmActuel() {
        return kmActuel;
    }

    public ArrayList<HistoriqueCarte> getLesHisto() {
        return lesHisto;
    }

    public Marque getLesmarques() {
        return lesmarques;
    }

    public Modele getLesmodeles() {
        return lesmodeles;
    }

    public Etat getLesetats() {
        return lesetats;
    }

    public Permis getLespermis() {
        return lespermis;
    }

    public Fournisseur getLesfournisseurs() {
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

    public void setMiseenCirculation(Date MiseenCirculation) {
        this.MiseenCirculation = MiseenCirculation;
    }

    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getMiseenCirculation() {
        return MiseenCirculation;
    }

    public int getNbplaces() {
        return nbplaces;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getType() {
        return type;
    }

    public int getPuissance() {
        return puissance;
    }

    public String getCarburant() {
        return Carburant;
    }
 
 

    
}
