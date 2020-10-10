

package Area;


public class ChooseFigure {

    public static void main(String[] args) {
        
        SquareArea cuadrado = new SquareArea(10);
        System.out.println(cuadrado.calculoArea());
        TriangleArea triangulo = new TriangleArea(5,2);
        System.out.println(triangulo.calculoArea());
    }

}
