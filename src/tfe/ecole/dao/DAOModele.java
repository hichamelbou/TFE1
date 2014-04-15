/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;


import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Etat;
import tfe.ecole.modele.Pojo_Modele;

/**
 *
 * @author hicham
 */
public class DAOModele {
      private static DAOModele uniqueInstance = new DAOModele();

    public static DAOModele getInstance() {
        return uniqueInstance;
    }

    public static boolean addModele(Pojo_Modele d) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_modele (idModele,modele,idMarque) values ( ?, ?,?)");
            preparedStatement.setInt(1, d.getIdModele());
            preparedStatement.setString(2, d.getDescription());
              preparedStatement.setInt(3, 1);
             preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    public static boolean selectModele(Pojo_Modele d) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_modele ");
          
             preparedStatement.execute();
         
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
}
    
    
    

