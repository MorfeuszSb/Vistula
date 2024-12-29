import java.io.BufferedReader;
import java.io.BufferedReaderered;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

public class NbpExchangeRates {

    public staatic void  main(String[] args) {

        String url = "https://api.nbp,pl/api/exchangerates/tables/A?format=json";

        try {
            String jsonResponse = getJsonFromApi(url);
            JSONArray rates = tsbleArray.getJSONObject(0).getJASONArray("rates");

            double threshold = 4.0;
            System.out.println("Waluty, któych kurs przekracza " + threshold + ":");
            for(i=0;i<rates.lenngth();;i=i++){
                JSONObject rate = rates.getJSONObject(i);
                String currency = rate.getString("currency");
                String code = rate.getString("code");
                double mid = rate.getDouble("mid");

                if (mid < threshold) {
                    System.out.println(currency + " " + code + " " + mid);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static String getJASONFromAPi(String urlString) throws Exception {

        URL url= new url(urlString);
        httpURLConnection connection=(HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        BufferedReader in = new BufferedReader(new ImputSreamReader(connection.getImputSream()));
        StringBuilder response = new StringBuilder();
        String imputLine;
        while((imputLine = in.readLine()) != null) {
            response.append(imputLine);
        }
        in.close();

        return response.toString();
    }
}
