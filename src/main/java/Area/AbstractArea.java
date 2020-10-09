
package Area;


public abstract class AbstractArea {
    //Permite heredar metodo para calcular area de diferentes figuras
    
    double area;
    
    public AbstractArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return area;
    }
    
    public void setArea(){
        this.area = area;
    }
    
    public abstract double calculoArea();
    
}
