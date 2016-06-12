package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.temperature;

public class TemperatureConverter {

    static double toCelsius(double tempFahrenheit) { return (tempFahrenheit - 32) * 5/9; }

    static double toFahrenheit(double tempCelsius) {
        return tempCelsius * 9/5 + 32;
    }
}
