/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Electrodomestico {
    private String color;
    private String Marca;
    private float precio;

    public String getColor() {
        return color;
    }

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String Marca, float precio) {
        this.color = color;
        this.Marca = Marca;
        this.precio = precio;
    }
    
    
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public float getPrecio() {
        
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    public void prender(){
        System.out.println("Se prendio el electrodomestico");
    }
    
    public void apagar(){
        System.out.println("Se apago el electrodomestico");
    }
}
