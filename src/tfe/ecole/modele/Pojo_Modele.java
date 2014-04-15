/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

/**
 *
 * @author hicham
 */
public class Pojo_Modele {
    private int idModele;
    private String description;
    private int idMarqueM;
    

    
    public Pojo_Modele() {
    }

    public Pojo_Modele(int idModele, String description, int idMarque) {
        this.idModele = idModele;
        this.description = description;
        this.idMarqueM = idMarque;
    }

    public int getIdModele() {
        return idModele;
    }


    public int getIdMarqueM() {
        return idMarqueM;
    }

    public String getDescription() {
        return description;
    }

    public void setIdModele(int idModele) {
        this.idModele = idModele;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIdMarqueM(int idMarqueM) {
        this.idMarqueM = idMarqueM;
    }

  
}
