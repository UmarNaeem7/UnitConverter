package unit.converter;

public class LengthConverter {
    private String inputType;
    private String ouputType;
    private double inputQuantity;
    private double outputQuantity;

    public LengthConverter(String inputType, String ouputType, double inputQuantity) {
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
        //supported types:
        //meter(m),kilometer(km),mile(mi),yard(yd),foot(ft),inch(in)
        
        //meter to kilometer(km)
        if (inputType.equals("meter(m)") && ouputType.equals("kilometer(km)"))
        {
            this.outputQuantity = this.inputQuantity/1000;
        }
        //kilometer(km) to meter
        else if (inputType.equals("kilometer(km)") && ouputType.equals("meter(m)"))
        {
            this.outputQuantity = this.inputQuantity*1000;
        }
        //mile(mi) to kilometer(km)
        else if (inputType.equals("mile(mi)") && ouputType.equals("kilometer(km)"))
        {
            this.outputQuantity = this.inputQuantity*1.609;
        }
        //kilometer(km) to mile(mi)
        else if (inputType.equals("kilometer(km)") && ouputType.equals("mile(mi)"))
        {
            this.outputQuantity = this.inputQuantity/1.609;
        }
        //mile(mi) to meter(m)
        else if (inputType.equals("mile(mi)") && ouputType.equals("meter(m)"))
        {
            this.outputQuantity = (this.inputQuantity*1.609)*1000;
        }
        //meter(m) to mile(mi)
        else if (inputType.equals("meter(m)") && ouputType.equals("mile(mi)"))
        {
            this.outputQuantity = (this.inputQuantity/1.609)/1000;
        }
        //meter(m) to yard(yd)
        else if (inputType.equals("meter(m)") && ouputType.equals("yard(yd)"))
        {
            this.outputQuantity = this.inputQuantity*1.094;
        }
        //yard(yd) to meter(m)
        else if (inputType.equals("yard(yd)") && ouputType.equals("meter(m)"))
        {
            this.outputQuantity = this.inputQuantity*1.094;
        }
        //kilometer(km) to yard(yd)
        else if (inputType.equals("kilometer(km)") && ouputType.equals("yard(yd)"))
        {
            this.outputQuantity = (this.inputQuantity*1.094)*1000;
        }
        //yard(yd) to kilometer(km)
        else if (inputType.equals("yard(yd)") && ouputType.equals("kilometer(km)"))
        {
            this.outputQuantity = (this.inputQuantity*1.094)/1000;
        }
        //yard(yd) to mile(mi)
        else if (inputType.equals("yard(yd)") && ouputType.equals("mile(mi)"))
        {
            this.outputQuantity = this.inputQuantity/1760;
        }
        //mile(mi) to yard(yd)
        else if (inputType.equals("mile(mi)") && ouputType.equals("yard(yd)"))
        {
            this.outputQuantity = this.inputQuantity*1760;
        }
        //meter to foot(ft)
        else if (inputType.equals("meter(m)") && ouputType.equals("foot(ft)"))
        {
            this.outputQuantity = this.inputQuantity*3.281;
        }
        //foot(ft) to meter
        else if (inputType.equals("foot(ft)") && ouputType.equals("meter(m)"))
        {
            this.outputQuantity = this.inputQuantity/3.281;
        }
        //kilometer(km) to foot(ft)
        else if (inputType.equals("kilometer(km)") && ouputType.equals("foot(ft)"))
        {
            this.outputQuantity = this.inputQuantity*3280.840;
        }
        //foot(ft) to kilometer(km)
        else if (inputType.equals("foot(ft)") && ouputType.equals("kilometer(km)"))
        {
            this.outputQuantity = this.inputQuantity/3280.840;
        }
        //mile(mi) to foot(ft)
        else if (inputType.equals("mile(mi)") && ouputType.equals("foot(ft)"))
        {
            this.outputQuantity = this.inputQuantity*5280;
        }
        //foot(ft) to mile(mi)
        else if (inputType.equals("foot(ft)") && ouputType.equals("mile(mi)"))
        {
            this.outputQuantity = this.inputQuantity/5280;
        }
        //yard(yd) to foot(ft)
        else if (inputType.equals("yard(yd)") && ouputType.equals("foot(ft)"))
        {
            this.outputQuantity = this.inputQuantity*3;
        }
        //foot(ft) to yard(yd)
        else if (inputType.equals("foot(ft)") && ouputType.equals("yard(yd)"))
        {
            this.outputQuantity = this.inputQuantity/3;
        }
        //meter to inch(in)
        else if (inputType.equals("meter(m)") && ouputType.equals("inch(in)"))
        {
            this.outputQuantity = this.inputQuantity*39.370;
        }
        //inch(in) to meter
        else if (inputType.equals("inch(in)") && ouputType.equals("meter(m)"))
        {
            this.outputQuantity = this.inputQuantity/39.370;
        }
        //kilometer(km) to inch(in)
        else if (inputType.equals("kilometer(km)") && ouputType.equals("inch(in)"))
        {
            this.outputQuantity = this.inputQuantity*39370;
        }
        //inch(in) to kilometer(km)
        else if (inputType.equals("inch(in)") && ouputType.equals("kilometer(km)"))
        {
            this.outputQuantity = this.inputQuantity/39370;
        }
        //mile(mi) to inch(in)
        else if (inputType.equals("mile(mi)") && ouputType.equals("inch(in)"))
        {
            this.outputQuantity = this.inputQuantity*63360;
        }
        //inch(in) to mile(mi)
        else if (inputType.equals("inch(in)") && ouputType.equals("mile(mi)"))
        {
            this.outputQuantity = this.inputQuantity/63360;
        }
        //yard(yd) to inch(in)
        else if (inputType.equals("yard(yd)") && ouputType.equals("inch(in)"))
        {
            this.outputQuantity = this.inputQuantity*36;
        }
        //inch(in) to yard(yd)
        else if (inputType.equals("inch(in)") && ouputType.equals("yard(yd)"))
        {
            this.outputQuantity = this.inputQuantity/36;
        }
        //foot(ft) to inch(in)
        else if (inputType.equals("foot(ft)") && ouputType.equals("inch(in)"))
        {
            this.outputQuantity = this.inputQuantity*12;
        }
        //inch(in) to foot(ft)
        else if (inputType.equals("inch(in)") && ouputType.equals("foot(ft)"))
        {
            this.outputQuantity = this.inputQuantity/12;
        }
        //same types
        else
        {
            this.outputQuantity = this.inputQuantity;
        }
        return this.outputQuantity;
    }
}
