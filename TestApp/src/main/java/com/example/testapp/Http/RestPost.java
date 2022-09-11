package com.example.testapp.Http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class RestPost {
    public static String httpPostGetContract(String Url) throws IOException {
        final URL url = new URL(Url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);

        int responseCode = httpURLConnection.getResponseCode();
        return getResponse(httpURLConnection);
    }

    public static String getResponse(HttpURLConnection httpURLConnection){
        try(final BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
            String inLine;
            final StringBuilder response = new StringBuilder();
            while ((inLine = in.readLine()) != null){
                response.append(inLine);
            }
            return response.toString();
        } catch (final Exception ex){
            ex.printStackTrace();
            return "";
        }
    }
}
