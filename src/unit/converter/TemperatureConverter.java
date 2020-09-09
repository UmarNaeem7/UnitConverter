package unit.converter;

public class TemperatureConverter {
    private String inputType;
    private String ouputType;
    private double inputQuantity;
    private double outputQuantity;

    public TemperatureConverter(String inputType, String ouputType, double inputQuantity) {
        this.inputType = inputType;
        this.ouputType = ouputType;
        this.inputQuantity = inputQuantity;
    }

    public String getOuputType() {
        return ouputType;
    }

    public void setOuputType(String ouputType) {
        this.ouputType = ouputType;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public double getInputQuantity() {
        return inputQuantity;
    }

    public void setInputQuantity(double inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public double getOutputQuantity() {
        return outputQuantity;
    }

    public void setOutputQuantity(double outputQuantity) {
        this.outputQuantity = outputQuantity;
    }
    
    public double convert(){
        //available types:
        //Celcius(C),Fahrenheit(F),Kelvin(K)
        
        //Celcius(C) to Fahrenheit(F)
        if (inputType.equals("Celcius(C)") && ouputType.equals("Fahrenheit(F)"))
        {
            this.outputQuantity = (9.0/5.0)*this.inputQuantity+32;
        }
        //Fahrenheit(F) to Celcius(C)
        else if (inputType.equals("Fahrenheit(F)") && ouputType.equals("Celcius(C)"))
        {
            this.outputQuantity = (5.0/9.0)*(this.inputQuantity-32);
        }
        //Celcius(C) to Kelvin(K)
        else if (inputType.equals("Celcius(C)") && ouputType.equals("Kelvin(K)"))
        {
            this.outputQuantity = this.inputQuantity+273.15;
        }
        //Kelvin(K) to Celcius(C)
        else if (inputType.equals("Kelvin(K)") && ouputType.equals("Celcius(C)"))
        {
            this.outputQuantity = this.inputQuantity-273.15;
        }
        //Fahrenheit(F) to Kelvin(K)
        else if (inputType.equals("Fahrenheit(F)") && ouputType.equals("Kelvin(K)"))
        {
            this.outputQuantity = this.inputQuantity+457.87;
        }
        //Kelvin(K) to Fahrenheit(F)
        else if (inputType.equals("Kelvin(K)") && ouputType.equals("Fahrenheit(F)"))
        {
            this.outputQuantity = this.inputQuantity-457.87;
        }
        //same types
        else
        {
            this.outputQuantity = this.inputQuantity;
        }
        return this.outputQuantity;
    }
}
