/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Modele;
import tfe.ecole.modele.Pojo_Tournee;

/**
 *
 * @author hicham
 */
public class DAOTournee {
    
    
    private static DAOTournee uniqueInstance = new DAOTournee();

    public static DAOTournee getInstance() {
        return uniqueInstance;
    }

    public static boolean addTournee(Pojo_Tournee tour) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_tournee (idTournee,alias,annee,cout,distance,type,periodeHebdo,jourDelasemaine) values ( ?, ?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, tour.getIdtournee());
            preparedStatement.setString(2, tour.getAlias());
            preparedStatement.setInt(3, tour.getAnnee());
            preparedStatement.setFloat(4, tour.getCout());
            preparedStatement.setInt(5, tour.getDistance());
            preparedStatement.setString(6, tour.getType());
            preparedStatement.setString(7, tour.getPeriodehebdo());
            preparedStatement.setString(8, tour.getJourdelasemaine());





              
             preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    public static boolean selecttournee(Pojo_Tournee tour) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from  pojo_tournee ");
          
             preparedStatement.execute();
         
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
    
    }
    
    
    
    
    
    
    
}
