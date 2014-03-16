/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

/**
 *
 * @author hicham
 */
public class Permis {
    private int idPermis;
    private String intitule;
    private String description;

    public Permis() {
    }

    public int getIdPermis() {
        return idPermis;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setIdPermis(int idPermis) {
        this.idPermis = idPermis;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
