/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Affecter;

/**
 *
 * @author hicham
 */
public class DAOaffecter {
    
    
    
        private static  DAOaffecter uniqueInstance = new  DAOaffecter();

    public static  DAOaffecter getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addAffectation(Pojo_Affecter aff) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into affecter(idtransporteur,idVehicule) values ( ?, ?)");
            preparedStatement.setInt(1, aff.getIdtransporteur());;
            preparedStatement.setString(2, aff.getIdvehicule());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
    
    
}
