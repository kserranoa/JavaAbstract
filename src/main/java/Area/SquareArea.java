
package Area;


public class SquareArea extends AbstractArea{
        double lado;
        
        
        public SquareArea(double area, double lado){
            super(area);
            this.lado = lado;
        }
        
      @Override
       public double calculoArea(double lado){
             area = lado ** 2;
        }
}
