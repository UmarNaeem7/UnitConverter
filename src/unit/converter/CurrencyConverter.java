package unit.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyConverter {
    
    private String API;
    private String parameters;
    private String completeHTTPRequest;
    private String convertedAmount;

    public CurrencyConverter() {
        API = new String();
        API = "https://api.exchangerate.host/convert";
        parameters = new String();
        parameters = "?amount=NUM&from=SOURCE&to=DEST";
        completeHTTPRequest = new String();
        convertedAmount = new String();
    }

    public String getConvertedAmount() {
        return convertedAmount;
    }
    
    public void formatURL(String inputType,String outputType,String amount){
        String a = new String();
        String b = new String();
        //extract "USD" from "US Dollars (USD)" with regex
        Matcher m1 = Pattern.compile("\\(([^)]+)\\)").matcher(inputType);
        while(m1.find()) {
          a += m1.group(1);
        }
        Matcher m2 = Pattern.compile("\\(([^)]+)\\)").matcher(outputType);
        while(m2.find()) {
          b += m2.group(1);
        }
        parameters = parameters.replace("NUM", amount);
        parameters = parameters.replace("SOURCE", a);
        parameters = parameters.replace("DEST", b);
        completeHTTPRequest = API + parameters;
        System.out.println(completeHTTPRequest);
    }
    
    public boolean sendGETRequestToAPI(String inputType,String outputType,String amount) throws MalformedURLException{
        formatURL(inputType, outputType, amount);
        URL url = new URL(this.completeHTTPRequest);
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            try (BufferedReader in = new BufferedReader(
		new InputStreamReader(connection.getInputStream())))
		{
			String line;
                        String json = new String();
			while ((line = in.readLine()) != null){
				System.out.println(line);
                                json += line;
                        }
                        String[] tokens = json.split(":");
                        this.convertedAmount = tokens[tokens.length-1];
                        this.convertedAmount = this.convertedAmount.substring(0, this.convertedAmount.length()-1);
                        return true;
		}
            
    
        } catch (IOException e) {
            System.out.println("Not working");
            return false;
        }
    }
    
}
