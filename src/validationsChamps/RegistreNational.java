/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validationsChamps;

/**
 *
 * @author hicham
 */
public class RegistreNational {
     public static boolean checkRegistreNational(String registreNational) {
        if (registreNational == null || registreNational.isEmpty()) {
            System.out.println("veuillez inserer une donnée svp");
            return false;
        }
        if (registreNational.length() != 11) {
            System.out.println("veuillez introduire le bon format");
            return false;
        }
        try {
            Long.valueOf(registreNational);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
