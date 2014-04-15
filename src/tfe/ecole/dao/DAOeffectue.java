/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Effectue;
import tfe.ecole.modele.Pojo_Tournee;

/**
 *
 * @author hicham
 */
public class DAOeffectue {
    
      private static DAOeffectue uniqueInstance = new DAOeffectue();

    public static DAOeffectue getInstance() {
        return uniqueInstance;
    }

    public static boolean addEffectue(Pojo_Effectue eff) {
        try {
            
               Date dateSqld = new Date(eff.getDatec().getTime()); 
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_effectue (numpesee,dateC,heureDepart,heureArriver,killometrageParcouru,Poidsnet,kmdepart,kmfin,idtransporteur,idTournee) values ( ?, ?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setDate(1, dateSqld);
            preparedStatement.setInt(2, eff.getNumePesee());
            preparedStatement.setInt(3, eff.getHeureDepart());
            preparedStatement.setInt(4, eff.getHeureArriver());
            preparedStatement.setFloat(5, eff.getDuree());
            preparedStatement.setInt(6, eff.getKmparcouru());
            preparedStatement.setFloat(7, eff.getPoidsnet());
            preparedStatement.setInt(8, eff.getKmdepart());
            preparedStatement.setInt(9, eff.getKmfin());
            preparedStatement.setInt(10, 12);
            preparedStatement.setInt(11, 1);
          





              
             preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    public static boolean selecteffectue(Pojo_Effectue EFF) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_effectue ");
          
             preparedStatement.execute();
         
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
