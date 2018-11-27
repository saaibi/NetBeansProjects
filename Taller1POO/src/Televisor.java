/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Televisor extends Electrodomestico implements SintonizarCanales,ControlarVolumen{
    
    private String tamaño;
    private String resulucion;

    /**
     * @return the tamaño
     */
    public String getTamaño() {
        return tamaño;
    }

    public Televisor(String tamaño, String resulucion) {
        this.tamaño = tamaño;
        this.resulucion = resulucion;
    }

    public Televisor(String tamaño, String resulucion, String color, String Marca, float precio) {
        super(color, Marca, precio);
        this.tamaño = tamaño;
        this.resulucion = resulucion;
    }
    
    
    

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the resulucion
     */
    public String getResulucion() {
        return resulucion;
    }

    /**
     * @param resulucion the resulucion to set
     */
    public void setResulucion(String resulucion) {
        this.resulucion = resulucion;
    }
    
    public void verCanal(){
    System.out.println("Viendo un canal ...");
    }

    @Override
    public void verCanalUno() {
    System.out.println("Viendo el canal uno en el tv");
    }

    @Override
    public void verCanalRCN() {
        System.out.println("Viendo el canal RCN en el tv");
    }

    @Override
    public void verCanalCaracol() {
        System.out.println("Viendo el canal CARACOL en el tv");
    }

    @Override
    public void subirVolumen() {
        System.out.println("Subiendo el voluman al tv");
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Bajando el voluman al tv");
    }
}
