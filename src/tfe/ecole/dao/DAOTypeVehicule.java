/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Marque;
import tfe.ecole.modele.Pojo_TypeVehicule;

/**
 *
 * @author hicham
 */
public class DAOTypeVehicule {
            private static DAOTypeVehicule uniqueInstance = new DAOTypeVehicule();

    public static DAOTypeVehicule getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addTypeVehicule(Pojo_TypeVehicule typeV) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_typevehicule(idTypeVehicule,type) values ( ?, ?)");
            preparedStatement.setInt(1, typeV.getIdTypeVehicule());;
            preparedStatement.setString(2, typeV.getTypeVehicule());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
    
    
    
       public static boolean selectTypeVehicule(Pojo_TypeVehicule typeV) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_typevehicule");
          
            preparedStatement.execute();
           
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
}
