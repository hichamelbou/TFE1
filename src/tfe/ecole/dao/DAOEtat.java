/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Etat;

/**
 *
 * @author hicham
 */
public class DAOEtat {
    
        private static DAOEtat uniqueInstance = new DAOEtat();

    public static DAOEtat getInstance() {
        return uniqueInstance;
    }

    public static boolean addEtat(Pojo_Etat e) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_etatvehicule (idEtatVehicule,etat) values ( ?, ?)");
            preparedStatement.setInt(1, e.getIdEtat());
            preparedStatement.setString(2, e.getDescription());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    }
    
    
      public static boolean selectEtat(Pojo_Etat e) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_etatvehicule (idEtatVehicule,etat) ");
           
            preparedStatement.execute();
           
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
