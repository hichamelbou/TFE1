/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validationsChamps;

/**
 *
 * @author hicham
 */
public class VerifTelephone {
 public static boolean checkNumTel(String numtel) {

        if (numtel == null || numtel.isEmpty()) {
            System.out.println("veuillez inserer une donnée svp");
            return false;
        }
        if (numtel.length() != 9 || numtel.length()!= 10 ) {
            System.out.println("veuillez introduire le bon format");
            return false;
        }
        try {
            Long.valueOf(numtel);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            e.printStackTrace();
            return false;
        }
        return true;

}}
