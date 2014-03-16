/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.modele;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yema
 */
public class HistoriqueCarte {

    private Date dateutilisation;

    public HistoriqueCarte() {
    }
   

    public Date getDateUtilisation() {
        return dateutilisation;
    }

    public void setDateUtilisation(Date DateUtilisation) {
        this.dateutilisation = DateUtilisation;
    }

    public HistoriqueCarte(Date DateUtilisation) {
        this.dateutilisation = DateUtilisation;
    }

 
}
