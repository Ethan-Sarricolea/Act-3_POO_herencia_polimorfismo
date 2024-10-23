/*
 * Author: Ethan Yahel Sarricolea Cortés
 * Description: Codigo de subclase de figura geometrifca "Circuclo"
 */

public class Circulo extends FiguraGeometrica {
    double radius;

    /**
     * Primer metodo constructor
     * 
     * Este metodo es para el caso en que solo reciba  como argumento el radio del circulo
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @param radius (radio del circulo)
     */

    public Circulo(double radius){
        super();
        this.radius = radius;
    }

    /**
     * segundo metodo constructor para el caso de recibir todos los parametros
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @param color (String / cadena con el color del circulo)
     * @param padding (doolean / relleno del circulo)
     * @param radius (double / radio del circulo)
     */
    public Circulo(String color, boolean padding, double radius){
        super(color, padding);
        this.radius = radius;
    }

    /**
     * Funcion setter para cambiar el valor del radio del circulo
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @param radius (double con el nuevo valor del radio)
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /**
     * Metodo getter para obtener el valor del radio
     * 
     * @author Ethan Yahel Sarricolea Cortés
     * @return radius (double / radio del circulo)
     */
    public double getRadius(){
        return radius;
    }

    /**
     * @author Ethan Yahel Sarricolea Cortés
     * @return Area del circulo 
     */
    public double calculateArea(){
        return Math.PI*(radius*radius);
    }

    /**
     * @author Ethan Yahel Sarricolea Cortés
     * @return Perimetro del circulo
     */
    public double calculatePerimeter(){
        return radius * 2 * Math.PI;
    }

    /**
     * @author Ethan Yahel Sarricolea Cortés
     * @return cadena con la informacion del circulo
     */
    @Override
    public String toString(){
        return("\nRadio: " + radius + "\nArea: " + this.calculateArea() + "\nPerimeter: " + this.calculatePerimeter());
    }
}
