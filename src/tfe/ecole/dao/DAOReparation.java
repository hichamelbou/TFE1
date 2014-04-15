/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Documents;
import tfe.ecole.modele.Pojo_Reparation;
import tfe.ecole.modele.Pojo_Transporteur;

/**
 *
 * @author hicham
 */
public class DAOReparation {
  
    
    
    
        private static DAOReparation  uniqueInstance = new DAOReparation ();

    public static DAOReparation  getInstance() {
        return uniqueInstance;
    }

    
    
    
     public static boolean addReparation(Pojo_Reparation rep){
        
        try{
            
             
         
             Date dateSqld = new Date(rep.getDatereparatiob().getTime()); 
            



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_reparation (idReparation,cout,note,dateCreation,idTypeReparation,idVehicule,idFournisseur) VALUES (? , ?, ?,?,?,?,?)");
            preparedStatement.setInt(1,rep.getIdReparation());
               
          
            preparedStatement.setDouble(2, rep.getCout());
              preparedStatement.setString(3,rep.getNote());
             preparedStatement.setDate(4,dateSqld);

        
            preparedStatement.setInt(5,1);
            preparedStatement.setString(6,"asdd");
            preparedStatement.setInt(7,1);
           

            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
     }
    
    
    
    
      
    public static boolean selectReparation(Pojo_Reparation rep){
        
        try{
            
           
           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_reparation");
            preparedStatement.setInt(1,rep.getIdReparation());
                    
          
            preparedStatement.execute();
         
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
