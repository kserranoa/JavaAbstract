
package Area;


public class SquareArea extends AbstractArea{
        private double lado;
        
       public SquareArea(double lado){
           this.lado = lado;
       }
       
       public double calculoArea(){
             return (Math.pow(lado, 2));        }
}
