/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_TypeDocument;
import tfe.ecole.modele.Pojo_TypeEntretien;

/**
 *
 * @author hicham
 */
public class DAOTypeDocument {
    
    
            private static DAOTypeDocument uniqueInstance = new DAOTypeDocument();

    public static DAOTypeDocument getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addTypeDocument(Pojo_TypeDocument typ) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_typedocument(idTypeDocument,type) values ( ?, ?)");
            preparedStatement.setInt(1, typ.getIdDocument());;
            preparedStatement.setString(2, typ.getTypedoc());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    
    
    }




public static boolean selectTypeDocument(Pojo_TypeDocument typ) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  into pojo_typedocument");
            
            preparedStatement.execute();
     
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    
    
    }














}
