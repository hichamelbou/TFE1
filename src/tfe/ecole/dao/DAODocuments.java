/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Documents;
import tfe.ecole.modele.Pojo_Entretien;

/**
 *
 * @author hicham
 */
public class DAODocuments {
          private static  DAODocuments uniqueInstance = new  DAODocuments();

    public static  DAODocuments  getInstance() {
        return uniqueInstance;
    }

       public static boolean addDocument(Pojo_Documents doc){
        
        try{
            
             
         
             Date dateSqld = new Date(doc.getDateCreation().getTime()); 
             Date dateSqlp = new Date(doc.getDateExpiration().getTime()); 



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_document (idDocument,dateCreation,dateExpiration,cout,note,idTypeDocument,idVehicule,idFournisseur,idtransporteur) VALUES (? , ?, ?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,doc.getIdDocument());
             
            preparedStatement.setDate(2,dateSqld);
            preparedStatement.setDate(3,dateSqlp);
      
            preparedStatement.setDouble(4, doc.getMontant());
            preparedStatement.setString(5,doc.getNote());
            preparedStatement.setInt(6,1);
            preparedStatement.setString(7,"asdd");
            preparedStatement.setInt(8,1);
            preparedStatement.setString(9,"1");


            
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    public static boolean selectDocumentsAdministratifs(Pojo_Documents documents){
        
        try{ 
         
           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_document");
           
           //ajouter les clés étrangére
            
            preparedStatement.execute();
         
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
    }
    
    
    
}
}
