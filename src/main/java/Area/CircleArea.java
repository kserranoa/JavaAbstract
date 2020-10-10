
package Area;


public class CircleArea extends AbstractArea{
    // Clase hereda abstracta para calculo area Circulo
    
    private double radio; 
    
    public CircleArea(double radio){
        this.radio = radio;
    }
    
    public double calculoArea(){
        return Math.pow((Math.PI * radio),2);
    }
    
}
