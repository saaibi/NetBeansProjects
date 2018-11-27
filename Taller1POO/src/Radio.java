/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Radio extends Electrodomestico implements ControlarVolumen{
    
    private int npilas;
    private String frecuencia;
    private String potencia;

    public Radio(int npilas, String frecuencia, String potencia) {
        this.npilas = npilas;
        this.frecuencia = frecuencia;
        this.potencia = potencia;
    }

    
    
    /**
     * @return the npilas
     */
    public int getNpilas() {
        return npilas;
    }

    /**
     * @param npilas the npilas to set
     */
    public void setNpilas(int npilas) {
        this.npilas = npilas;
    }

    /**
     * @return the frecuencia
     */
    public String getFrecuencia() {
        return frecuencia;
    }

    /**
     * @param frecuencia the frecuencia to set
     */
    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * @return the potencia
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
    public void escucharMusica(){
    System.out.println("Escuchando musica en el radio....");
    }

    @Override
    public void subirVolumen() {
        System.out.println("Subindo el voluman al radio");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Bajando el voluman al radio");
    }
    
}
