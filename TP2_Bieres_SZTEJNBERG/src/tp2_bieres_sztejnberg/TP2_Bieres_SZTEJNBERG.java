/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_sztejnberg;

/**
 *
 * @author orian
 */
public class TP2_Bieres_SZTEJNBERG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson") ;
       
       uneBiere.lireEtiquette();
       
        
       BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
       autreBiere.lireEtiquette();
       
       BouteilleBiere uneBiere1 = new BouteilleBiere("Desperados",9.0, "Fischer");
        uneBiere1.lireEtiquette();
        
        BouteilleBiere uneBiere2 = new BouteilleBiere("Goudale",7.2, "Brasserie de Gayant");
        uneBiere2.lireEtiquette();
        
        BouteilleBiere uneBiere3 = new BouteilleBiere("Affligem",4.6, "Brasserie Affligem");
        uneBiere3.lireEtiquette();
        //Question 12
        boolean capsulebiere3;
        capsulebiere3 = uneBiere3.Decapsuler();
        System.out.println(capsulebiere3);
        capsulebiere3 = uneBiere3.Decapsuler();
        System.out.println(capsulebiere3);// TEST QUESTION 12
        //Question13
    System.out.println(uneBiere) ;
    }
    
}
