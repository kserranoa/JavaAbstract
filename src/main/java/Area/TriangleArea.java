
package Area;


public class TriangleArea extends AbstractArea{
    // Clase hereda abstracta para calculo area Triangulo
    private double altura, lado;
    
    public TriangleArea(double altura, double lado){
        this.altura = altura;
        this. lado = lado; 
    }
    
    public double calculoArea(){
        return (lado*altura) * 0.5;
    }
}
