import java.time.LocalDate;

public class FiguraGeometrica {
    private String color;
    private boolean padding;
    protected LocalDate creationDate;

    /**
     * El metodo constructor para el caso en que no se pasen argumentos
     * @author Ethan Yahel Sarricolea Cortés
     * @param void (no requiere nada)
     */
    public FiguraGeometrica() {
        this.color = "Blanco";
        this.padding = false;
        this.creationDate = LocalDate.now();
    }

    /**
     * Segundo metodo constructor con recepcion de parametros
     * @author Ethan Yahel Sarricolea Cortés
     * @param color (String / cadena con el color de la figura)
     * @param padding (boolean / esta o no rellena la figura)
     */
    public FiguraGeometrica(String color, boolean padding){
        this.color = color;
        this.padding = padding;
        this.creationDate = LocalDate.now();
    }

    /**
     * Metodo getter para obtener el color de la figura
     * @author Ethan Yahel Sarricolea Cortés
     * @return String (El color de la figura)
     */
    public String getColor(){
       return color; 
    }

    /**
     * Metodo setter para cambiar el color de la figura
     * @author Ethan Yahel Sarricolea Cortés
     * @param color (String con el nuevo color)
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Metodo getter de relleno de la figura
     * @author Ethan Yahel Sarricolea Cortés
     * @return padding (Esta o no relleno)
     */
    public boolean getPadding(){
        return this.padding;
    }

    /**
     * Metodo setter del relleno de la figura
     * @author Ethan Yahel Sarricolea Cortés Ethan Yahel
     * @param padding (Con o sin relleno)
     */
    public void setPadding(boolean padding){
        this.padding = padding;
    }

    /**
     * Metodo getter de la fecah de creación
     * @author Ethan Yahel Sarricolea Cortés
     * @return creationDate (El objeto de la fecha de creación)
     */
    public LocalDate getCreationDate(){
        return creationDate;
    }

    /**
     * Sobreescritura de metodo toString
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return Cadena con las especificaciones de cada atributo de la figura
     */
    @Override
    public String toString(){
        return ( "Color: " + color + " | Padding: " + padding + " | Date: " + creationDate.toString());
    }
}
