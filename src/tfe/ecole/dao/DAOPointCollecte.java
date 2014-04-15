/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Modele;
import tfe.ecole.modele.PointCollecte;

/**
 *
 * @author hicham
 */
public class DAOPointCollecte {
    
    
    
    private static DAOPointCollecte uniqueInstance = new DAOPointCollecte();

    public static DAOPointCollecte getInstance() {
        return uniqueInstance;
    }

    public static boolean addPointCollecte(PointCollecte point) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_pointcollecte (idPointCollecte,nom,qtMoyenne,adresse) values ( ?, ?,?,?)");
            preparedStatement.setInt(1, point.getIdPointCollecte());
            preparedStatement.setString(2, point.getNom());
              preparedStatement.setFloat(3,point.getQtMoyenne());
              preparedStatement.setString(4,point.getAdresse());
             preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    public static boolean selectPointcollete(PointCollecte point) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_pointcollecte ");
          
             preparedStatement.execute();
         
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
