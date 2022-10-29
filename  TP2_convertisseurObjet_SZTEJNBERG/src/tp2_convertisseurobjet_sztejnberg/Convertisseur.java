/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_sztejnberg;

/**
 *
 * @author orian
 */
public class Convertisseur {
    int nbconversion;

public Convertisseur(){
    nbconversion=0;
}

public float CelciusVersKelvin (float floatCelc){
    float floatKev= floatCelc +(float) (273.15);
    nbconversion=nbconversion+1;
    return floatKev;
}
public float KelvinVersCelcius (float floatKev){
    float floatCelc= floatKev - (float) (273.15);
    nbconversion=nbconversion+1;
    return floatCelc;
}
public float FarenheitVersCelcius (float floatFar ){
    float floatCelc= (floatFar - 32)/(float)(1.8);
    nbconversion=nbconversion+1;
    return floatCelc;
}
public float CelciustVersFarenheit (float floatCelc ){
    float floatFar= (floatCelc *(float)(1.8))+32;
    nbconversion=nbconversion+1;
    return floatFar;
}
public float FarenheitVersKelvin (float floatFar ){
    float floatKev= (floatFar - 32)/(float)(1.8)+(float)(273.15);
    nbconversion=nbconversion+1;
    return floatKev;
}
public float KelvinVersFarenheit (float floatKev ){
    float floatFar= ((floatKev-(float)(273.15)) *(float)(1.8))+32;
    nbconversion=nbconversion+1;
    return floatFar;
}
@Override
public String toString () {
 return "nb de conversion = "+ nbconversion;
}

}

