/*
 * To fourange this template, fouroose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Fournisseur;

/**
 *
 * @author hicham
 */
public class DAOFournisseur {
       private static DAOFournisseur uniqueInstance = new DAOFournisseur();

    public static DAOFournisseur getInstance() {
        return uniqueInstance;
    }
      public static boolean addFournisseur(Pojo_Fournisseur four){
        
        try{
             



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_fournisseur(idFournisseur,adresse,CodePostale,email,nom,note,telephone,ville,idCategorieFournisseur) VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setLong(1, four.getIdFournisseur());
            preparedStatement.setString(2, four.getAdresse());
            preparedStatement.setInt(3, four.getCodePostale());
            preparedStatement.setString(4, four.getMail());
            
             preparedStatement.setString(5, four.getNom());
            preparedStatement.setString(6, four.getNote());
            preparedStatement.setInt(7,four.getTelephone());
            preparedStatement.setString(8, four.getVille());
            preparedStatement.setInt(9, 1);

            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
      
      
      
          public static boolean selectFournisseur(Pojo_Fournisseur four){
        
        try{
             



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_fournisseur");
           

            preparedStatement.executeUpdate();
       
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    } 
      
      
      
      
      
    } 