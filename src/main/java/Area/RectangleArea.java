package Area;

public class RectangleArea extends AbstractArea{
     // Clase hereda abstracta para calculo area Rectangulo
    private double longitud, ancho;
    
    public RectangleArea(double longitud, double ancho){
        this.longitud = longitud; 
        this.ancho = ancho;
    }
    
    public double calculoArea(){
        return longitud * ancho;
    }
}
