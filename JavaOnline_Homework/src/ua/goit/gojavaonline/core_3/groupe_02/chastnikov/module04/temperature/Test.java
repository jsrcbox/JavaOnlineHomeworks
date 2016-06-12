package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.temperature;

public class Test {
    public static void main(String[] args) {
        double temperature;
        temperature = TemperatureConverter.toCelsius(97.9);
        System.out.printf("%.2f" + "\n", temperature);
        temperature = TemperatureConverter.toFahrenheit(36.6);
        System.out.printf("%.2f" + "\n", temperature);
    }
}
