/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_sztejnberg;

/**
 *
 * @author orian
 */
public class TP2_manip_SZTEJNBERG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        //question4: assiette 3 et 2 ientiques possèdent le meme nombre de calories 600
System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
assiette2.nbCalories+=100;
System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
    }
    
    
}
