package Abstraction_Interfaces.task4_5;

public class Kelvin extends ConverterTemperature{
    @Override
    public void convert(double celsium) {
        double result;
        result = celsium + 237.15;

        System.out.println("From celsium to kelvin ="+result+" K");
    }
}
