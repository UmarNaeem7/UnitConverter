package unit.converter;

public class TimeConverter {
    private String inputType;
    private String ouputType;
    private double inputQuantity;
    private double outputQuantity;

    public TimeConverter(String inputType, String ouputType, double inputQuantity) {
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
        //second(s),minute(min),hour(hr),day(d),week(week),month(month),year(y)
        
        //second(s) to minute(min)
        if (inputType.equals("second(s)") && ouputType.equals("minute(min)"))
        {
            this.outputQuantity = this.inputQuantity/60;
        }
        //minute(min) to second(s)
        else if (inputType.equals("minute(min)") && ouputType.equals("second(s)"))
        {
            this.outputQuantity = this.inputQuantity*60;
        }
        //hour(hr) to minute(min)
        else if (inputType.equals("hour(hr)") && ouputType.equals("minute(min)"))
        {
            this.outputQuantity = this.inputQuantity*60;
        }
        //minute(min) to hour(hr)
        else if (inputType.equals("minute(min)") && ouputType.equals("hour(hr)"))
        {
            this.outputQuantity = this.inputQuantity/60;
        }
        //hour(hr) to second(s)
        else if (inputType.equals("hour(hr)") && ouputType.equals("second(s)"))
        {
            this.outputQuantity = this.inputQuantity*3600;
        }
        //second(s) to hour(hr)
        else if (inputType.equals("second(s)") && ouputType.equals("hour(hr)"))
        {
            this.outputQuantity = this.inputQuantity/3600;
        }
        //second(s) to day(d)
        else if (inputType.equals("second(s)") && ouputType.equals("day(d)"))
        {
            this.outputQuantity = this.inputQuantity/86400;
        }
        //day(d) to second(s)
        else if (inputType.equals("day(d)") && ouputType.equals("second(s)"))
        {
            this.outputQuantity = this.inputQuantity*86400;
        }
        //minute(min) to day(d)
        else if (inputType.equals("minute(min)") && ouputType.equals("day(d)"))
        {
            this.outputQuantity = this.inputQuantity/1440;
        }
        //day(d) to minute(min)
        else if (inputType.equals("day(d)") && ouputType.equals("minute(min)"))
        {
            this.outputQuantity = this.inputQuantity*1440;
        }
        //day(d) to hour(hr)
        else if (inputType.equals("day(d)") && ouputType.equals("hour(hr)"))
        {
            this.outputQuantity = this.inputQuantity*24;
        }
        //hour(hr) to day(d)
        else if (inputType.equals("hour(hr)") && ouputType.equals("day(d)"))
        {
            this.outputQuantity = this.inputQuantity/24;
        }
        //second(s) to week(week)
        else if (inputType.equals("second(s)") && ouputType.equals("week(week)"))
        {
            this.outputQuantity = this.inputQuantity/604800;
        }
        //week(week) to meter
        else if (inputType.equals("week(week)") && ouputType.equals("second(s)"))
        {
            this.outputQuantity = this.inputQuantity*604800;
        }
        //minute(min) to week(week)
        else if (inputType.equals("minute(min)") && ouputType.equals("week(week)"))
        {
            this.outputQuantity = this.inputQuantity/10080;
        }
        //week(week) to minute(min)
        else if (inputType.equals("week(week)") && ouputType.equals("minute(min)"))
        {
            this.outputQuantity = this.inputQuantity*10080;
        }
        //hour(hr) to week(week)
        else if (inputType.equals("hour(hr)") && ouputType.equals("week(week)"))
        {
            this.outputQuantity = this.inputQuantity/168;
        }
        //week(week) to hour(hr)
        else if (inputType.equals("week(week)") && ouputType.equals("hour(hr)"))
        {
            this.outputQuantity = this.inputQuantity*168;
        }
        //day(d) to week(week)
        else if (inputType.equals("day(d)") && ouputType.equals("week(week)"))
        {
            this.outputQuantity = this.inputQuantity/7;
        }
        //week(week) to day(d)
        else if (inputType.equals("week(week)") && ouputType.equals("day(d)"))
        {
            this.outputQuantity = this.inputQuantity*7;
        }
        //second(s) to month(month)
        else if (inputType.equals("second(s)") && ouputType.equals("month(month)"))
        {
            this.outputQuantity = this.inputQuantity/2628000;
        }
        //month(month) to second(s)
        else if (inputType.equals("month(month)") && ouputType.equals("second(s)"))
        {
            this.outputQuantity = this.inputQuantity*2628000;
        }
        //minute(min) to month(month)
        else if (inputType.equals("minute(min)") && ouputType.equals("month(month)"))
        {
            this.outputQuantity = this.inputQuantity*39370;
        }
        //month(month) to minute(min)
        else if (inputType.equals("month(month)") && ouputType.equals("minute(min)"))
        {
            this.outputQuantity = this.inputQuantity*39370;
        }
        //hour(hr) to month(month)
        else if (inputType.equals("hour(hr)") && ouputType.equals("month(month)"))
        {
            this.outputQuantity = this.inputQuantity/43800;
        }
        //month(month) to hour(hr)
        else if (inputType.equals("month(month)") && ouputType.equals("hour(hr)"))
        {
            this.outputQuantity = this.inputQuantity*43800;
        }
        //day(d) to month(month)
        else if (inputType.equals("day(d)") && ouputType.equals("month(month)"))
        {
            this.outputQuantity = this.inputQuantity/30.417;
        }
        //month(month) to day(d)
        else if (inputType.equals("month(month)") && ouputType.equals("day(d)"))
        {
            this.outputQuantity = this.inputQuantity*30.417;
        }
        //week(week) to month(month)
        else if (inputType.equals("week(week)") && ouputType.equals("month(month)"))
        {
            this.outputQuantity = this.inputQuantity/4.345;
        }
        //month(month) to week(week)
        else if (inputType.equals("month(month)") && ouputType.equals("week(week)"))
        {
            this.outputQuantity = this.inputQuantity*4.345;
        }
        //second(s) to year(y)
        else if (inputType.equals("second(s)") && ouputType.equals("year(y)"))
        {
            this.outputQuantity = this.inputQuantity/31536000;
        }
        //year(y) to second(s)
        else if (inputType.equals("year(y)") && ouputType.equals("second(s)"))
        {
            this.outputQuantity = this.inputQuantity*31536000;
        }
        //minute(min) to year(y)
        else if (inputType.equals("minute(min)") && ouputType.equals("year(y)"))
        {
            this.outputQuantity = this.inputQuantity/525600;
        }
        //year(y) to minute(min)
        else if (inputType.equals("year(y)") && ouputType.equals("minute(min)"))
        {
            this.outputQuantity = this.inputQuantity*525600;
        }
        //hour(hr) to year(y)
        else if (inputType.equals("hour(hr)") && ouputType.equals("year(y)"))
        {
            this.outputQuantity = this.inputQuantity/8760;
        }
        //year(y) to hour(hr)
        else if (inputType.equals("year(y)") && ouputType.equals("hour(hr)"))
        {
            this.outputQuantity = this.inputQuantity*8760;
        }
        //day(d) to year(y)
        else if (inputType.equals("day(d)") && ouputType.equals("year(y)"))
        {
            this.outputQuantity = this.inputQuantity/365;
        }
        //year(y) to day(d)
        else if (inputType.equals("year(y)") && ouputType.equals("day(d)"))
        {
            this.outputQuantity = this.inputQuantity*365;
        }
        //week(week) to year(y)
        else if (inputType.equals("week(week)") && ouputType.equals("year(y)"))
        {
            this.outputQuantity = this.inputQuantity/52.143;
        }
        //year(y) to week(week)
        else if (inputType.equals("year(y)") && ouputType.equals("week(week)"))
        {
            this.outputQuantity = this.inputQuantity*52.143;
        }
        //month(month) to year(y)
        else if (inputType.equals("month(month)") && ouputType.equals("year(y)"))
        {
            this.outputQuantity = this.inputQuantity/12;
        }
        //year(y) to month(month)
        else if (inputType.equals("year(y)") && ouputType.equals("month(month)"))
        {
            this.outputQuantity = this.inputQuantity*12;
        }
        //same types
        else
        {
            this.outputQuantity = this.inputQuantity;
        }
        return this.outputQuantity;
    }

}
