/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_sztejnberg;

/**
 *
 * @author orian
 */
public class Personne {
    String nom;
    String prenom;
//    int nbVoitures;
//    Voiture liste_voitures

public Personne(String unNom,String unPrenom){
    nom=unNom;
    prenom=unPrenom;
    
}
    
public String toString(){
    return (nom +" "+ prenom);
}
    
}
