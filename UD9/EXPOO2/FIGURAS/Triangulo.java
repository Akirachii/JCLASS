
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo (double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double area(){
        return (base*altura)/2;
    }

    @Override
    public double perimetro(){
        double lado = Math.sqrt((base/2)*(base/2)+(altura + altura));

        return 2 * lado * base;
    }

}
