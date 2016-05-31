package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module04.temperature;

public class TemperatureConverter {

    static float toCelsius(float tempFahrenheit) {
        return (tempFahrenheit - 32) * 5/9;
    }

    static float toFahrenheit(float tempCelsius) {
        return tempCelsius * 9/5 + 32;
    }
}
