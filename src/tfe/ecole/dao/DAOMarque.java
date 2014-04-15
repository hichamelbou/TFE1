/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;

import tfe.ecole.modele.Pojo_Marque;




/**
 *
 * @autho
 */
public class DAOMarque {
    
        private static DAOMarque uniqueInstance = new DAOMarque();

    public static DAOMarque getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addMarque(Pojo_Marque md) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_marque(idMarque,marque) values ( ?, ?)");
            preparedStatement.setInt(1, md.getIdMarque());;
            preparedStatement.setString(2, md.getDescription());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
      public static boolean selectMarque(Pojo_Marque md) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_marque ");
           
            preparedStatement.execute();
          
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}  
    
}