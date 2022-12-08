package Exception.task5;

public class Calculator {

    public Double add (double a,double b){
     return a+b;
    }

    public Double sub (double a,double b){

        return a-b;
    }

    public Double mul (double a,double b){
        return a*b;
    }

    public Double div (double a,double b) {
        double c;
        if (b != 0) {
            c = a / b;
        } else {
            throw new ArithmeticException("No div on 0");
        }
        return c;
    }
}
