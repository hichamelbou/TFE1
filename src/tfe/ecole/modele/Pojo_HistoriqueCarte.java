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
public class Pojo_HistoriqueCarte {

    private Date dateutilisation;

    public Pojo_HistoriqueCarte() {
    }
   

    public Date getDateUtilisation() {
        return dateutilisation;
    }

    public void setDateUtilisation(Date DateUtilisation) {
        this.dateutilisation = DateUtilisation;
    }

    public Pojo_HistoriqueCarte(Date DateUtilisation) {
        this.dateutilisation = DateUtilisation;
    }

 
}
