/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe.ecole.dao;

import java.sql.PreparedStatement;
import tfe.ecole.modele.Pojo_CategorieFournisseur;

/**
 *
 * @author hicham
 */
public class DAOCategoriefournisseur {
      private static DAOCategoriefournisseur uniqueInstance = new DAOCategoriefournisseur();

    public static DAOCategoriefournisseur getInstance() {
        return uniqueInstance;
        
    }

    public static boolean addCatFournisseur(Pojo_CategorieFournisseur cat) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("Insert into pojo_categoriefournisseur(idCategorieFournisseur,categorie) values ( ?, ?)");
            preparedStatement.setInt(1, cat.getIdCategorie());;
            preparedStatement.setString(2, cat.getCategorie());
            preparedStatement.executeUpdate();
            ConnexionMySQL.getInstance().getConn().commit();
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
    
    
       public static boolean selectCatFournisseur(Pojo_CategorieFournisseur cat) {
        try {
            PreparedStatement preparedStatement = ConnexionMySQL.getInstance().getConn().prepareStatement("select * from pojo_categoriefournisseur ");
           
            preparedStatement.execute();
           
            return true; } 
        
        catch (Exception e1) {
            e1.printStackTrace();
            return false;
        }
}
    
    
    
    
}
