/**
 * Author: Sarricolea Cortés Ethan Yahel
 * Descriptin: Codigo main para la ejecucion de la interfaz
 */

import java.util.Scanner;


public class App {

    static Scanner scan = new Scanner(System.in);


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        int figOpc;
        
        // ciclo do while
        do{
            System.out.println("Selecciona la figura por crear");
            System.out.println("\n1)Circulo 2)Rectangulo 3)Triangulo 4)salir");
            figOpc = scan.nextInt();

            switch(figOpc){
                
                //crear circulo
                case 1:
                    System.out.println("Introduzca el area del circulo");
                    double radio = scan.nextDouble();
                    Circulo circulo = new Circulo(radio);

                    mostrarFigOpcs(circulo);
                    break;
                
                //crear rectngulo     
                case 2: 
                    System.out.println("Introduce la base del rectangulo");
                    double base = scan.nextDouble();

                    System.out.println("Intodusca la altura del rectangulo");
                    double height = scan.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(base, height);

                    mostrarFigOpcs(rectangulo);
                    break;
                
                //crear triangulo    
                case 3:
                    System.out.print("Introduce el lado 1 del triángulo: ");
                    double lado1 = scan.nextDouble();
                    
                    System.out.print("Introduce el lado 2 del triángulo: ");
                    double lado2 = scan.nextDouble();
                    
                    System.out.print("Introduce el lado 3 del triángulo: ");
                    double lado3 = scan.nextDouble();

                    Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

                    mostrarFigOpcs(triangulo);
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;       
            }
        
        
        }while(figOpc != 4);

    // Método para mostrar las opciones de cada figura
    private static void mostrarFigOpcs(final FiguraGeometrica figGeo) {
        int figOpcs;
        
        do {
            System.out.println("\nOpciones para la figura:");
            System.out.println("1) Calcular área  2) Calcular perímetro  3) Ver detalles  4) Volver al menú principal");
            figOpcs = scan.nextInt();

            switch (figOpcs) {
                case 1:
                    System.out.println("Área: " + figGeo.getArea());
                    break;

                case 2:
                    System.out.println("Perímetro: " + figGeo.getPerimeter());
                    break;

                case 3:
                    System.out.println(figGeo.toString());
                    break;

                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (figOpcs != 4);
    }
        

    }
}

/*
 * Aqui la idea es que se genere un do while donde se puedan crear o seleccionar figuras
 * Aqui se genera otro do while para las eleccion de las opciones
 * una vez creada o seleccionada una nueva figura se seleccionan las opciones de la figura (area, perimetro, geter, seter, toString)
 * tambien dara la opcion de salir al menu principal, donde se podra crear otra figura o ver las que ya hay.
 */
