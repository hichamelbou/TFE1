/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validationsChamps;

import org.apache.commons.validator.EmailValidator;

/**
 *
 * @author hicham
 */
public class VerifEmail {
    public static boolean validateEmailAddress(String votreEmail){
EmailValidator emailValidator = EmailValidator.getInstance();
return emailValidator.isValid(votreEmail);


}
}
