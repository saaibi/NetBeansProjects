
package orquestaunac;

import static javafx.scene.paint.Color.color;


public class InstrumentoMusical{
    
    private String Color;
    private String Precio;
    private String Tipo;

    public InstrumentoMusical(String Color, String Precio, String Tipo) {
        this.Color = Color;
        this.Precio = Precio;
        this.Tipo = Tipo;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Precio
     */
    public String getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
   
    
    
    
    
    
}
