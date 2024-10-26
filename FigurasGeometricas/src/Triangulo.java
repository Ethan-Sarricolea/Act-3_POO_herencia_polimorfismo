/*
 * Author: Samuel Salazar / Ethan Yahel
 * Description:
 */

public class Triangulo extends FiguraGeometrica {
    double lado1 = 1.0;
    double lado2 = 1.0;
    double lado3 = 1.0;

    // Constructor por defecto
    public Triangulo() {
        super();
    }

    // Constructor con tres lados como parámetros
    public Triangulo(double lado1, double lado2, double lado3) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters para los tres lados
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Método para calcular el área 
    public double getArea() {
  
        return (Math.sqrt(3) / 4) * lado1 * lado1;
    }

    // Método para calcular el perímetro
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // Método toString para describir el triángulo
    public String toString() {
        return "Triángulo con lados " + lado1 + ", " + lado2 + ", " + lado3 + 
               ". Color: " + getColor() + ", Relleno: " + isRelleno();
    }
}
