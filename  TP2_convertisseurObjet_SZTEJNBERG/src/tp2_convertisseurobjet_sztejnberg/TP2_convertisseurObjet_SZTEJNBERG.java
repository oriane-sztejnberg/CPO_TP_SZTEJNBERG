/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_sztejnberg;

/**
 *
 * @author orian
 */
public class TP2_convertisseurObjet_SZTEJNBERG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur converter= new Convertisseur();
        float temp=converter.CelciusVersKelvin(30);
        converter.FarenheitVersCelcius(50);
        converter.KelvinVersFarenheit(200);
        Convertisseur converter2= new Convertisseur();
        converter2.FarenheitVersKelvin(30);
        converter2.CelciustVersFarenheit(80);
        converter2.KelvinVersCelcius(55);
       
    
        System.out.println(temp);
        System.out.println(converter);
        System.out.println(converter2);
    
                
    }
    
}
