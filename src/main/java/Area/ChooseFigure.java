/*
Referencia:
Shakmurla. 2018. 73- Clases abstractas y métodos abstractos en java.- Programa de ejemplo.  https://youtu.be/ZSR_SFPfiy8
Diagrama de flujo de datos
Karina Serrano Avendanoa. https://drive.google.com/file/d/1tZ4GKVLlmF1BHN9y75M-jUTPlFMRkFmn/view
*/
package Area;

public class ChooseFigure {
    //Permite heredar clase abstrata
    public static void main(String[] args) {       
             
// Objeto calcula area cuadrado
        try {
          //  Block of code to try
          SquareArea cuadrado = new SquareArea(10);
          System.out.println("El area del cuadrado es:  " + cuadrado.calculoArea());
        }
        catch(Exception e) {
        //  Block of code to handle errors
                  System.out.println("Error en los datos ingresados en el codigo");
        }     
        
// Objeto calcula area triangulo
        try {
            //  Block of code to try
            TriangleArea triangulo = new TriangleArea(5,2);
            System.out.println("El area del triangulo es:  " + triangulo.calculoArea());
        }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("Error en los datos ingresados en el codigo");
        }
        
// Objeto calcula area rombo
        try {
            //  Block of code to try
            RhombusArea rombo = new RhombusArea(4,5);
            System.out.println("El area del rombto es:  " + rombo.calculoArea());
        }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("Error en los datos ingresados en el codigo");
        }
        
// Objeto calcula area rectangulo
        try {
            //  Block of code to try
            RectangleArea rectangulo = new RectangleArea(10,3);
            System.out.println("El area del rectanguo es:  " + rectangulo.calculoArea());
        }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("Error en los datos ingresados en el codigo");
        }
        
// Objeto calcula area circulo
        try {
            //  Block of code to try
            CircleArea circulo = new CircleArea(7);
            System.out.println("El area del circulo es:  " + circulo.calculoArea());
        }
        catch(Exception e) {
            //  Block of code to handle errors
            System.out.println("Error en los datos ingresados en el codigo");
        }

    }
}