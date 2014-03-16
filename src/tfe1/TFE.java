/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tfe1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import tfe.ecole.vue.AjoutDocuments;
import tfe.ecole.vue.AjoutEntretien;

/**
 *
 * @author yema
 */
public class TFE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ceci est un test
        JPanel jp = new AjoutEntretien();
        JFrame jf = new JFrame();
        jf.add(jp);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);

    }
}
