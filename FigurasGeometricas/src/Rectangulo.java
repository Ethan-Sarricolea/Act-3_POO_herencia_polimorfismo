/**
 * Author: Ethan Yahel Sarricolea Cortés
 * Description: Aqui se realiza la subclase Rectangulo
 */

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double height;

    public Rectangulo(double base, double height){
        super();
        this.base = base;
        this.height = height;
    }

    public Rectangulo(String color, boolean padding, double base, double height){
        super(color, padding);
        this.base = base;
        this.height = height;
    }

    public void setBase(){

    }

    public double getBase(){

    }

    public void setHeight(){

    }

    public double getHeight(){

    }

    public double calculateArea(){

    }

    public double calculatePerimeter(){

    }

    @Override
    public String toString(){

    }
}
