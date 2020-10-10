
package Area;


public class TriangleArea extends AbstractArea{
    private double altura, lado;
    
    public TriangleArea(double a, double l){
        altura = a;
        lado = l; 
    }
    
    public double calculoArea(){
        return (lado*altura) * 0.5;
    }
}
