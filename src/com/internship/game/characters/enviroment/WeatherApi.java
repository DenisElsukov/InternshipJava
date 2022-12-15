package com.internship.game.characters.enviroment;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WeatherApi {
    private String output = getUrlContent("http://api.openweathermap.org/data/2.5/forecast?lat=44.8&lon=20.48&appid=eec0abb70860db2dd253a3682f8edd3a");

    public static void main(String[] args) {
        System.out.println("Temperature now is: " + new WeatherApi().getTemp() + " Celsius");

    }

    private double tempFromJson () {
        if (!output.isEmpty()) {
            JSONObject obj = new JSONObject(output);
            return obj.getJSONArray("list").getJSONObject(1).getJSONObject("main").getDouble("temp");
        } else return 0;
    }

    private double kelvvinToGrade() {
        return tempFromJson() - 273.15;
    }

    public int getTemp() {
        return (int)kelvvinToGrade();
    }



    private static String getUrlContent(String urlAddress) {
        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL(urlAddress);
            URLConnection urlConnect = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((urlConnect.getInputStream())));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return content.toString();
    }


}
