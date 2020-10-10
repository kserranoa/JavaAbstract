
package Area;


public class RhombusArea extends AbstractArea{
    // Clase hereda abstracta para calculo area Rombo
    private double lado, altura;
    
    public RhombusArea(double lado, double altura){
        this.lado = lado; 
        this.altura = altura; 
    }
    
    public double calculoArea(){
        return lado * altura;
    }
}
