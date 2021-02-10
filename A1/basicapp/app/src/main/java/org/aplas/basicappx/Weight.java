package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double ounce){
        this.gram = ounce/0.035274;
    }

    public void setPound(double pound){
        this.gram = pound/0.00220462;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce(){
        return gram/28.3495231;
    }

    public double getPound(){
        return gram*0.00220462;
    }

    public double convert(String oriUnit, String convUnit, double value){
        if(oriUnit.equals("Grm")){
            setGram(value);
        }
        else if(oriUnit.equals("Onc")){
            setOunce(value);
        }
        else if(oriUnit.equals("Pnd")){
            setPound(value);
        }
        if(convUnit.equals("Grm")){
            return getGram();
        }
        else if(convUnit.equals("Onc")){
            return getOunce();
        }
        else if(convUnit.equals("Pnd")){
            return getPound();
        }
        return 0;
    }
}
