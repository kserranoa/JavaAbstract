
package Area;


public class RhombusArea extends AbstractArea{
    private double lado, altura;
    
    public RhombusArea(double lado, double altura){
        this.lado = lado; 
        this.altura = altura; 
    }
    
    public double calculoArea(){
        return lado * altura;
    }
}
