package tfe.ecole.dao;


import tfe.ecole.dao.ConnexionMySQL;
import java.sql.Date;
import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_Transporteur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hicham
 */
public class DAOTransporteur {
    
    
    
    
    
    
        private static DAOTransporteur  uniqueInstance = new DAOTransporteur ();

    public static DAOTransporteur  getInstance() {
        return uniqueInstance;
    }

    
    
     
    public static boolean addTransporteur(Pojo_Transporteur trans){
        
        try{
             Date dateSql  = new Date(trans.getDateNaissance().getTime());
             Date dateSqla = new Date(trans.getDateVisite().getTime()); 
             Date dateSqlb = new Date(trans.getDateexpiractionCartePro().getTime());
             Date dateSqlc = new Date(trans.getDateExpirationcap().getTime()); 



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_transporteur (idtransporteur,nom,prenom,datenaissance,adresse,codepostal,ville,numtelephone,email,dateVisiteMedicale,dateExpirationCarteChauffeur,dateExpirationcap) VALUES (? , ?, ?,?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, trans.getIdTransporteur());
                    
            preparedStatement.setString(2, trans.getNom());
            preparedStatement.setString(3, trans.getPrenom());
            preparedStatement.setDate(4, dateSql);
            preparedStatement.setString(5, trans.getAdresse());
            preparedStatement.setInt(6, trans.getCodepostal());
            preparedStatement.setString(7, trans.getVille());
            preparedStatement.setString(8, trans.getTelephone());
            preparedStatement.setString(9, trans.getEmail());
            preparedStatement.setDate(10, dateSqla);
            preparedStatement.setDate(11, dateSqlb);
            preparedStatement.setDate(12, dateSqlc);
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    public static boolean selectTransporteur(Pojo_Transporteur trans){
        
        try{
         



           PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_transporteur");
           
            preparedStatement.execute();
          
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
