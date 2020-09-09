package unit.converter;

public class WeightConverter {
    private String inputType;
    private String ouputType;
    private double inputQuantity;
    private double outputQuantity;

    public WeightConverter(String inputType, String ouputType, double inputQuantity) {
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
        //gram(g),kilogram(kg),pound(lb),ounce(oz),carat(car,ct)
        
        //gram(g) to kilogram(kg)
        if (inputType.equals("gram(g)") && ouputType.equals("kilogram(kg)"))
        {
            this.outputQuantity = this.inputQuantity/1000;
        }
        //kilogram(kg) to gram(g)
        else if (inputType.equals("kilogram(kg)") && ouputType.equals("gram(g)"))
        {
            this.outputQuantity = this.inputQuantity*1000;
        }
        //pound(lb) to kilogram(kg)
        else if (inputType.equals("pound(lb)") && ouputType.equals("kilogram(kg)"))
        {
            this.outputQuantity = this.inputQuantity/2.205;
        }
        //kilogram(kg) to pound(lb)
        else if (inputType.equals("kilogram(kg)") && ouputType.equals("pound(lb)"))
        {
            this.outputQuantity = this.inputQuantity*2.205;
        }
        //pound(lb) to gram(g)
        else if (inputType.equals("pound(lb)") && ouputType.equals("gram(g)"))
        {
            this.outputQuantity = this.inputQuantity*453.592;
        }
        //gram(g) to pound(lb)
        else if (inputType.equals("gram(g)") && ouputType.equals("pound(lb)"))
        {
            this.outputQuantity = this.inputQuantity/453.592;
        }
        //ounce(oz) to pound(lb)
        else if (inputType.equals("ounce(oz)") && ouputType.equals("pound(lb)"))
        {
            this.outputQuantity = this.inputQuantity*0.062;
        }
        //pound(lb) to ounce(oz)
        else if (inputType.equals("pound(lb)") && ouputType.equals("ounce(oz)"))
        {
            this.outputQuantity = this.inputQuantity*16;
        }
        //ounce(oz) to gram(g)
        else if (inputType.equals("ounce(oz)") && ouputType.equals("gram(g)"))
        {
            this.outputQuantity = this.inputQuantity*28.35;
        }
        //gram(g) to ounce(oz)
        else if (inputType.equals("gram(g)") && ouputType.equals("ounce(oz)"))
        {
            this.outputQuantity = this.inputQuantity/28.35;
        }
        //ounce(oz) to kilogram(g)
        else if (inputType.equals("ounce(oz)") && ouputType.equals("kilogram(g)"))
        {
            this.outputQuantity = this.inputQuantity*0.028;
        }
        //kilogram(g) to ounce(oz)
        else if (inputType.equals("kilogram(g)") && ouputType.equals("ounce(oz)"))
        {
            this.outputQuantity = this.inputQuantity/0.028;
        }
        //carat(car,ct) to pound(lb)
        else if (inputType.equals("carat(car,ct)") && ouputType.equals("pound(lb)"))
        {
            this.outputQuantity = this.inputQuantity/2267.962;
        }
        //pound(lb) to carat(car,ct)
        else if (inputType.equals("pound(lb)") && ouputType.equals("carat(car,ct)"))
        {
            this.outputQuantity = this.inputQuantity*2267.962;
        }
        //carat(car,ct) to gram(g)
        else if (inputType.equals("carat(car,ct)") && ouputType.equals("gram(g)"))
        {
            this.outputQuantity = this.inputQuantity/5;
        }
        //gram(g) to carat(car,ct)
        else if (inputType.equals("gram(g)") && ouputType.equals("carat(car,ct)"))
        {
            this.outputQuantity = this.inputQuantity*5;
        }
        //carat(car,ct) to kilogram(g)
        else if (inputType.equals("carat(car,ct)") && ouputType.equals("kilogram(g)"))
        {
            this.outputQuantity = this.inputQuantity/5000;
        }
        //kilogram(g) to carat(car,ct)
        else if (inputType.equals("kilogram(g)") && ouputType.equals("carat(car,ct)"))
        {
            this.outputQuantity = this.inputQuantity*5000;
        }
        //carat(car,ct) to ounce(oz)
        else if (inputType.equals("carat(car,ct)") && ouputType.equals("ounce(oz)"))
        {
            this.outputQuantity = this.inputQuantity/141.748;
        }
        //ounce(oz) to carat(car,ct)
        else if (inputType.equals("ounce(oz)") && ouputType.equals("carat(car,ct)"))
        {
            this.outputQuantity = this.inputQuantity*141.748;
        }
        //same types
        else
        {
            this.outputQuantity = this.inputQuantity;
        }
        return this.outputQuantity;
    }
}
