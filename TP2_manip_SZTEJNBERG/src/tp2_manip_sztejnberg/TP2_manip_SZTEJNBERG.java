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
// inversement des assiettes 1 et 2:
Tartiflette assietteinter=new Tartiflette (100);
assietteinter=assiette1;
assiette1=assiette2;
assiette2=assietteinter;
System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
//question6: une reference objet qui annonce referencer un type d'objet,
//peut réferencer que ce type d'objet et pas un autre.

Moussaka Moussakamere= new Moussaka(100);
Moussaka Moussaka1=Moussakamere;
Moussaka Moussaka2=Moussakamere;
Moussaka Moussaka3=Moussakamere;
Moussaka Moussaka4=Moussakamere;
Moussaka Moussaka5=Moussakamere;
Moussaka Moussaka6=Moussakamere;
Moussaka Moussaka7=Moussakamere;
Moussaka Moussaka8=Moussakamere;
Moussaka Moussaka9=Moussakamere;
Moussaka Moussaka10=Moussakamere;
Moussaka1=new Moussaka(200);
Moussaka2=new Moussaka(300);
Moussaka3=new Moussaka(400);
Moussaka4=new Moussaka(500);
Moussaka5=new Moussaka(600);
Moussaka6=new Moussaka(700);
Moussaka7=new Moussaka(800);
Moussaka8=new Moussaka(900);
Moussaka9=new Moussaka(1000);
Moussaka10=new Moussaka(1100);



    }
    
    
}
