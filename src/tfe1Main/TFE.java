/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe1Main;


import javax.swing.JFrame;
import javax.swing.JPanel;
import tfe.ecole.vue.AjoutReparation;
import tfe.ecole.vue.AjoutCarteCarburant;
import tfe.ecole.vue.AjoutCategorie;
import tfe.ecole.vue.AjoutDocuments;
import tfe.ecole.vue.AjoutEntretien;
import tfe.ecole.vue.AjoutEtat;

import tfe.ecole.vue.AjoutFournisseur;
import tfe.ecole.vue.AjoutHistoriqueCarte;
import tfe.ecole.vue.AjoutMarque;
import tfe.ecole.vue.AjoutModele;
import tfe.ecole.vue.AjoutTournee;
import tfe.ecole.vue.AjoutTransporteur;
import tfe.ecole.vue.AjoutTypeEntretien;
import tfe.ecole.vue.AjoutTypeReparation;
import tfe.ecole.vue.AjoutTypeVehicule;
import tfe.ecole.vue.AjoutVehicule1;
import tfe.ecole.vue.AjouterTypeDocument;
import tfe.ecole.vue.ajoutPointCollecte;

 class TFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ceci est un test
       JPanel jp1 = new AjoutTypeReparation();
       JPanel jp2 = new AjoutCarteCarburant();
       JPanel jp3 = new AjoutCategorie();
       JPanel jp4 = new AjoutDocuments();
       JPanel jp5 = new AjoutEntretien();
       JPanel jp6 = new AjoutEtat();
       JPanel jp7 = new AjoutFournisseur();
       JPanel jp8 = new AjoutHistoriqueCarte();
       JPanel jp9 = new AjoutMarque();
       JPanel jp10 = new AjoutModele();
       JPanel jp11 = new AjoutTournee();
       JPanel jp12 = new AjoutTransporteur();
       JPanel jp13 = new AjoutTypeEntretien();
       JPanel jp14 = new AjoutReparation();
       JPanel jp15 = new AjoutTypeVehicule();
       JPanel jp16 = new AjoutVehicule1();
       JPanel jp17 = new AjouterTypeDocument();
       JPanel jp18 = new ajoutPointCollecte();


      


    

     










        
        
         
        JFrame jf = new JFrame();
        jf.add(jp18);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);

    }
}
