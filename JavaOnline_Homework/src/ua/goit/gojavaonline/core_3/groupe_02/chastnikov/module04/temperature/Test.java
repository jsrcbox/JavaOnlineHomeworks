package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.temperature;

public class Test {
    public static void main(String[] args) {
        float temperature;
        temperature = TemperatureConverter.toCelsius(97.9f);
        System.out.println(temperature);
        temperature = TemperatureConverter.toFahrenheit(36.6f);
        System.out.println(temperature);
    }
}
