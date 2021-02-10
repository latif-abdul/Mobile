package org.aplas.basicappx;

public class Temperature {
    private double celcius;

    public Temperature() {
        this.celcius = 0;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double fahrenheit){
        this.celcius = (5*(fahrenheit-32))/9;
    }

    public void setKelvins(double kelvin){
        this.celcius = kelvin-273.15;
    }

    public double getFahrenheit(){
        return (celcius*9/5)+32;
    }

    public double getKelvins(){
        return celcius+273.15;
    }

    public double convert(String oriUnit, String convUnit, double value){
        double result = 0;
        if(oriUnit.equals("°F")){
            setFahrenheit(value);
        }
        else if(oriUnit.equals("K")){
            setKelvins(value);
        }
        else if(oriUnit.equals("°C")){
            setCelcius(value);
        }
        if(convUnit.equals("°F")){
            result = getFahrenheit();
        }
        else if(convUnit.equals("K")){
            result = getKelvins();
        }
        else if(convUnit.equals("°C")){
            result = getCelcius();
        }
        return result;
    }
}
