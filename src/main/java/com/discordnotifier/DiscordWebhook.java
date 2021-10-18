package com.discordnotifier;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DiscordWebhook {
    public static int sendRequest(String url, String json) throws IOException {
        URL webhookURL = new URL(url);
        HttpURLConnection con = (HttpURLConnection) webhookURL.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json; utf-8");
        con.setRequestProperty("Accept", "application/json");
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(json);
        wr.flush();
        wr.close();
        return con.getResponseCode();
    }
}
