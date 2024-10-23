/**
 * Author: Ethan Yahel Sarricolea Cortés
 * Description: Aqui se realiza la subclase Rectangulo
 */

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double height;

    /**
     * Metodo constructor con solo base y altura
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @param base (base de rectangulo)
     * @param height (altura de rectangulo)
     */
    public Rectangulo(double base, double height){
        super();
        this.base = base;
        this.height = height;
    }

    /**
     * Metodo constructor con todos los parametros
     * 
     * @author
     * @param color (String / cadena del color)
     * @param padding (boolean / relleno de figura)
     * @param base (double / valor de la base)
     * @param height (double / valor de la altura)
     */
    public Rectangulo(String color, boolean padding, double base, double height){
        super(color, padding);
        this.base = base;
        this.height = height;
    }

    /**
     * Metodo setter para actualizar el dato de la base
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @param base (double / valor de la base)
     */
    public void setBase(double base){
        this.base = base;
    }

    /**
     * Metodo getter para obtener el valor de la base
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return base (double)
     */
    public double getBase(){
        return this.base;
    }

    /**
     * Metodo setter para actualizar la altura
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @param height (double / dato de la altura)
     */
    public void setHeight(double height){
        this.height = height;
    }

    /**
     * Metodo getter para obtener el valor de la altura
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return height (double / dato de la altura)
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * Metodoo para calcular el area del rectangulo
     * 
     * retorna el area del rectangulo
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return area del rectangulo
     */
    public double calculateArea(){
        return (this.base*this.height);
    }

    /**
     * Metodo para calcular el perimetro del rectangulo
     * 
     * retorna el perimetro del rectangulo
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return perimetro del rectangulo
     */
    public double calculatePerimeter(){
        return (this.base*2 + this.height*2);
    }

    /**
     * Metodo toString
     * 
     * Sobreescritura del metodo toString para retornar los datos del rectangulo
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return String (cadena con los datos)
     */
    @Override
    public String toString(){
        return ("\nColor: " + this.color + "\nRelleno: " + this.padding + "\nBase: " + this.base + "\nAltura: " + this.height);
    }
}
