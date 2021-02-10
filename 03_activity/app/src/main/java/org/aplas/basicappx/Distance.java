package org.aplas.basicappx;

public class Distance {
    private double meter;

    public Distance() {
        this.meter = 0;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public void setInch(double inch) {
        this.meter = inch/39.3701;
    }

    public void setMile(double mile) {
        this.meter = mile/0.000621371;
    }

    public void setFoot(double foot) {
        this.meter = foot/3.28084;
    }

    public double getMeter() {
        return meter;
    }

    public double getInch() {
        return meter*39.3701;
    }

    public double getMile() {
        return meter*0.000621371;
    }

    public double getFoot() {
        return meter*3.28084;
    }

    public double convert(String oriUnit, String convUnit, double value) {
        if(oriUnit.equals("Mtr")) {
            setMeter(value);
        }
        if(oriUnit.equals("Inc")) {
            setInch(value);
        }
        if(oriUnit.equals("Mil")) {
            setMile(value);
        }
        else {
            setFoot(value);
        }
        if(convUnit.equals("Mtr")) {
            return getMeter();
        }
        if(convUnit.equals("Inc")) {
            return getInch();
        }
        if(convUnit.equals("Mil")) {
            return getMile();
        }
        else {
            return getFoot();
        }
    }
}
