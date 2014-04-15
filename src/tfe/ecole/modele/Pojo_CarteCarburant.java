/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

import java.util.ArrayList;

/**
 *
 * @author hicham
 */
public class Pojo_CarteCarburant {
    
    
    private int idCarburant;
    private int kmUtilisaton;
    private int litreCarburant;
    private ArrayList <Pojo_HistoriqueCarte> lesHisto;
    public Pojo_CarteCarburant() {
    }

    public int getIdCarburant() {
        return idCarburant;
    }

    public int getKmUtilisaton() {
        return kmUtilisaton;
    }

    public int getLitreCarburant() {
        return litreCarburant;
    }

    public void setIdCarburant(int idCarburant) {
        this.idCarburant = idCarburant;
    }

    public void setKmUtilisaton(int kmUtilisaton) {
        this.kmUtilisaton = kmUtilisaton;
    }

    public void setLitreCarburant(int litreCarburant) {
        this.litreCarburant = litreCarburant;
    }
    
    
    
    
    
    
    
}
