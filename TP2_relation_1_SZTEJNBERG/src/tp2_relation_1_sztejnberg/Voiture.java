/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_sztejnberg;

/**
 *
 * @author orian
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
public Voiture (String unModele,String uneMarque,int unePuissanceCV){
    modele=unModele;
    marque=uneMarque;
    puissanceCV=unePuissanceCV;    
    
}
    
    public String toString(){
    return (marque+""+modele+" "+puissanceCV);
    }
    
    
    
    
    
}
    
    
    
  
