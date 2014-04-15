/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Vehicule;

/**
 *
 * @author hicham
 */
public class DAOVehicule {
    
    
    
        private static DAOVehicule  uniqueInstance = new DAOVehicule ();

    public static DAOVehicule  getInstance() {
        return uniqueInstance;
    }

    
    
    
    
    
    
    public static boolean addVehicule(Pojo_Vehicule v){
        
        try{
             Date dateSqlachat  = new Date(v.getDateAchat().getTime());
             Date dateSqlgarantie = new Date(v.getGarantieExpire().getTime()); 
            



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_vehicule (idVehicule,carburant,dateAchat,garantieExpire,kmActuel,KmFinCirculation,kmInitial,nbrPlace,prixAchat,puissance,volume,idEtatVehicule,idFournisseur,idModele,idTypeVehicule) VALUES (? , ?, ?,?,?,?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, v.getNumerochassis());
                    
            preparedStatement.setString(2, v.getCarburant());
            preparedStatement.setDate(3,dateSqlachat);
            preparedStatement.setDate(4, dateSqlgarantie);
            preparedStatement.setInt(5, v.getKmActuel());
            preparedStatement.setInt(6, v.getKmfinCirculation());
            preparedStatement.setInt(7, v.getKmInitial());
            preparedStatement.setInt(8, v.getNbplaces());
            preparedStatement.setInt(9, v.getPrixAchat());
            preparedStatement.setInt(10, v.getPuissance());
           preparedStatement.setInt(11, v.getVolume());
           preparedStatement.setInt(12,1);
           preparedStatement.setInt(13,1);
           preparedStatement.setInt(14, 1);
           preparedStatement.setInt(15,1);
         //   preparedStatement.setDate(12, v.get);
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    public static boolean selectVehicule(Pojo_Vehicule v){
        
        try{
            
            



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_vehicule ");
           
                    
            
            preparedStatement.execute();
         
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
