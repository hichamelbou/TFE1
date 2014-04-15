/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_CarteCarburant;

/**
 *
 * @author hicham
 */
public class DAOCarteCarburant {
    
      private static DAOCarteCarburant  uniqueInstance = new DAOCarteCarburant ();

    public static DAOCarteCarburant  getInstance() {
        return uniqueInstance;
    }

    public static boolean addCarteCarburant(Pojo_CarteCarburant  carte) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_cartecarburant (idCarte,kmutulisation,litreconsome) values ( ?, ?,?)");
            preparedStatement.setInt(1, carte.getIdCarburant());
            preparedStatement.setInt(2, carte.getKmUtilisaton());
            preparedStatement.setInt(3, carte.getLitreCarburant());

            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
        
        
        
        
        
    }
    
        public static boolean selectCarteCarburant(Pojo_CarteCarburant  carte) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_cartecarburant ");
           
            preparedStatement.execute();
     
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
        
        
        
        
        
    }
    
    
    
    
    
}
