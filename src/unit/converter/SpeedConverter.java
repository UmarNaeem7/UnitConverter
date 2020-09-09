package unit.converter;

public class SpeedConverter {
    private String inputType;
    private String ouputType;
    private double inputQuantity;
    private double outputQuantity;

    public SpeedConverter(String inputType, String ouputType, double inputQuantity) {
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
        //kilometer/hour(km/h),mile/hour(mi/h),meter/second(m/s),knot(kt,kn)
        
        //kilometer/hour(km/h) to mile/hour(mi/h)
        if (inputType.equals("kilometer/hour(km/h)") && ouputType.equals("mile/hour(mi/h)"))
        {
            this.outputQuantity = this.inputQuantity*0.621;
        }
        //mile/hour(mi/h) to kilometer/hour(km/h)
        else if (inputType.equals("mile/hour(mi/h)") && ouputType.equals("kilometer/hour(km/h)"))
        {
            this.outputQuantity = this.inputQuantity*1.609;
        }
        //kilometer/hour(km/h) to meter/second(m/s)
        else if (inputType.equals("kilometer/hour(km/h)") && ouputType.equals("meter/second(m/s)"))
        {
            this.outputQuantity = this.inputQuantity*0.278;
        }
        //meter/second(m/s) to kilometer/hour(km/h)
        else if (inputType.equals("meter/second(m/s)") && ouputType.equals("kilometer/hour(km/h)"))
        {
            this.outputQuantity = this.inputQuantity*3.6;
        }
        //mile/hour(mi/h) to meter/second(m/s)
        else if (inputType.equals("mile/hour(mi/h)") && ouputType.equals("meter/second(m/s)"))
        {
            this.outputQuantity = this.inputQuantity*0.447;
        }
        //meter/second(m/s) to mile/hour(mi/h)
        else if (inputType.equals("meter/second(m/s)") && ouputType.equals("mile/hour(mi/h)"))
        {
            this.outputQuantity = this.inputQuantity*2.237;
        }
        //knot(kt,kn) to meter/second(m/s)
        else if (inputType.equals("knot(kt,kn)") && ouputType.equals("meter/second(m/s)"))
        {
            this.outputQuantity = this.inputQuantity*0.514;
        }
        //meter/second(m/s) to knot(kt,kn)
        else if (inputType.equals("meter/second(m/s)") && ouputType.equals("knot(kt,kn)"))
        {
            this.outputQuantity = this.inputQuantity*1.994;
        }
        //mile/hour(mi/h) to knot(kt,kn)
        else if (inputType.equals("mile/hour(mi/h)") && ouputType.equals("knot(kt,kn)"))
        {
            this.outputQuantity = this.inputQuantity*0.869;
        }
        //knot(kt,kn) to mile/hour(mi/h)
        else if (inputType.equals("knot(kt,kn)") && ouputType.equals("mile/hour(mi/h)"))
        {
            this.outputQuantity = this.inputQuantity*1.151;
        }
        //kilometer/hour(km/h)) to knot(kt,kn)
        else if (inputType.equals("kilometer/hour(km/h)") && ouputType.equals("knot(kt,kn)"))
        {
            this.outputQuantity = this.inputQuantity*0.540;
        }
        //knot(kt,kn) to kilometer/hour(km/h)
        else if (inputType.equals("knot(kt,kn)") && ouputType.equals("kilometer/hour(km/h)"))
        {
            this.outputQuantity = this.inputQuantity*1.852;
        }
        //same types
        else
        {
            this.outputQuantity = this.inputQuantity;
        }
        return this.outputQuantity;
    }
}
