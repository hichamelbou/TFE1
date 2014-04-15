/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_CarteCarburant;
import tfe.ecole.modele.Pojo_Entretien;
import tfe.ecole.modele.Pojo_Reparation;

/**
 *
 * @author hicham
 */
public class DAOEntretien {
    
        
      private static DAOEntretien  uniqueInstance = new DAOEntretien ();

    public static DAOEntretien  getInstance() {
        return uniqueInstance;
    }

      public static boolean addEntretien(Pojo_Entretien ent){
        
        try{
            
             
         
             Date dateSqld = new Date(ent.getDateDernierEntretien().getTime()); 
             Date dateSqlp = new Date(ent.getDateProchaineEntretien().getTime()); 



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_entretien (idEntretien,cout,dateCreation,dateprochain,km,kmprochain,note,idTypeEntretien,idVehicule,idFournisseur) VALUES (? , ?, ?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,ent.getIdEntretien());
                    
            preparedStatement.setDouble(2, ent.getCout());
            preparedStatement.setDate(3,dateSqld);
            preparedStatement.setDate(4,dateSqlp);
            preparedStatement.setInt(5, ent.getKmDernierEntretien());
            preparedStatement.setInt(6, ent.getProchaineEntretien());
            preparedStatement.setString(7, ent.getLibelle());
            preparedStatement.setInt(8,1);
            preparedStatement.setString(9,"asdd");
            preparedStatement.setInt(10,1);
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
      public static boolean selectEntretien(Pojo_Entretien ent){
        
        try{
            
           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_entretien");
            
            preparedStatement.execute();
         
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}}




