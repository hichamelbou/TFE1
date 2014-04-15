/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Marque;
import tfe.ecole.modele.Pojo_TypeReparation;

/**
 *
 * @author hicham
 */
public class DAOTypeReparation {
    
    
          private static DAOTypeReparation uniqueInstance = new DAOTypeReparation();

    public static DAOTypeReparation getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addTypeReparation(Pojo_TypeReparation  typrep) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_typereparation(idTypeReparation,type) values ( ?, ?)");
            preparedStatement.setInt(1, typrep.getIdTypeReparation());;
            preparedStatement.setString(2,typrep.getReparation());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}  
    
        public static boolean selectTypeReparation(Pojo_TypeReparation  typrep) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_typereparation");
     
            preparedStatement.execute();
        
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
} 
    
    
    
    
}
