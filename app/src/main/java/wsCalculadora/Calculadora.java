package wsCalculadora;

public class Calculadora {
    public double suma(double x, double y)
    {
        return x + y;
    }

    public double multiplica(double x, double y) {
        return x * y;
    }

    public double seno(double x) {
        return Math.sin(x);
    }

    public double coseno(double x) {
        return Math.cos(x);
    }

    public double tangente(double x) {
        return Math.tan(x);
    }

    public double resta(double x, double y)
    {
        return x - y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double exp (double x){
        return Math.pow(x,1); 
    }

    public double log(double x){
        return Math.log10(x);
    }
}
