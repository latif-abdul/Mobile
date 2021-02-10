package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    public Temperature() {
        celcius = 0;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.celcius = (fahrenheit-32)*5/9;
    }

    public void setKelvins(double kelvin) {
        this.celcius = (kelvin-273.15);
    }

    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit() {
        double fahrenheit = (celcius*9/5)+32;
        return fahrenheit ;
    }

    public double getKelvins() {
        double kelvins = celcius+273.15;
        return kelvins;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if(oriUnit.equals("°C")) {
            setCelcius(value);
        }
        else if(oriUnit.equals("°F")) {
            setFahrenheit(value);
        }
        else {
            setKelvins(value);
        }
        if(convUnit.equals("°C")) {
            return getCelcius();
        }
        else if(convUnit.equals("°F")) {
            return getFahrenheit();
        }
        else {
            return getKelvins();
        }
    }
}
