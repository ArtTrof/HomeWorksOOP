package Abstraction_Interfaces.task4_5;

public class Fahrenheit extends ConverterTemperature {
    @Override
    public void convert(double celsium) {
        double result;
        result = (celsium * 9/5)+32;
        System.out.println("From celsium to kelvin ="+result+" F");

    }
}
