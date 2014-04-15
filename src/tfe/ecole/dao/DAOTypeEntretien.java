/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Marque;
import tfe.ecole.modele.Pojo_TypeEntretien;

/**
 *
 * @author hicham
 */
public class DAOTypeEntretien {
    
            private static DAOTypeEntretien uniqueInstance = new DAOTypeEntretien();

    public static DAOTypeEntretien getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addTypeEntretien(Pojo_TypeEntretien typ) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_typeentretien(idTypeEntretien,type) values ( ?, ?)");
            preparedStatement.setInt(1, typ.getIdTypeEntretien());;
            preparedStatement.setString(2, typ.getType());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
       public static boolean selectTypeEntretien(Pojo_TypeEntretien typ) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_typeentretien");
           
            preparedStatement.execute();
         
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
    
    
}
