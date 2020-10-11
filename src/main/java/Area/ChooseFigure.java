/*
Referencia:
Shakmurla. 2018. 73- Clases abstractas y métodos abstractos en java.- Programa de ejemplo.  https://youtu.be/ZSR_SFPfiy8
Diagrama de flujo de datos
Karina Serrano Avendanoa. https://drive.google.com/file/d/1tZ4GKVLlmF1BHN9y75M-jUTPlFMRkFmn/view
*/

package Area;


public class ChooseFigure {

    public static void main(String[] args) {
        
        // Objeto calcula area cuadrado
        SquareArea cuadrado = new SquareArea(10);
        System.out.println(cuadrado.calculoArea());
        
        // Objeto calcula area triangulo
        TriangleArea triangulo = new TriangleArea(5,2);
        System.out.println(triangulo.calculoArea());
        
        // Objeto calcula area rombo
        RhombusArea rombo = new RhombusArea(4,5);
        System.out.println(rombo.calculoArea());
        
        // Objeto calcula area rectangulo
        RectangleArea rectangulo = new RectangleArea(10,3);
        System.out.println(rectangulo.calculoArea());
        
        // Objeto calcula area circulo
        CircleArea circulo = new CircleArea(7);
        System.out.println(circulo.calculoArea());
    }

}
