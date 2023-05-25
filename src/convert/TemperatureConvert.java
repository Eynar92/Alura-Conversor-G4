package convert;

public class TemperatureConvert {
    private double celsius;
    private double fahrenheit;
    private double kelvin;
    private double rankine;

    // Constructor para Celsius
    public TemperatureConvert(double celsius) {
        this.celsius = celsius;
        convertFromCelsius();
    }

    // Constructor para Fahrenheit, Kelvin y Rankine
    public TemperatureConvert(double fahrenheit, double kelvin, double rankine) {
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
        this.rankine = rankine;
        convertToCelsius();
    }

    // Constructor para Celsius, Fahrenheit, Kelvin y Rankine
    public TemperatureConvert(double celsius, double fahrenheit, double kelvin, double rankine) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
        this.rankine = rankine;
    }

    // Método estático para crear un objeto TemperatureConvert a partir de un valor en Celsius
    public static TemperatureConvert fromCelsius(double celsius) {
        return new TemperatureConvert(celsius);
    }

    // Método estático para crear un objeto TemperatureConvert a partir de un valor en Fahrenheit
    public static TemperatureConvert fromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return new TemperatureConvert(celsius);
    }

    // Método estático para crear un objeto TemperatureConvert a partir de un valor en Kelvin
    public static TemperatureConvert fromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        return new TemperatureConvert(celsius);
    }

    // Método estático para crear un objeto TemperatureConvert a partir de un valor en Rankine
    public static TemperatureConvert fromRankine(double rankine) {
        double celsius = (rankine - 491.67) / 1.8;
        return new TemperatureConvert(celsius);
    }

    // Método interno para realizar las conversiones de Celsius a Fahrenheit, Kelvin y Rankine
    private void convertFromCelsius() {
        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        rankine = (celsius + 273.15) * 1.8;
    }

    // Método interno para realizar la conversión a Celsius
    private void convertToCelsius() {
        celsius = (fahrenheit - 32) / 1.8;
    }

    // Getters y Setters

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        convertFromCelsius();
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        convertToCelsius();
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
        convertToCelsius();
    }

    public double getRankine() {
        return rankine;
    }

    public void setRankine(double rankine) {
        this.rankine = rankine;
        convertToCelsius();
    }
}