package com.discordnotifier;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.api.Node;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DiscordNotifierPluginTest
{
	//This is a test case
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DiscordNotifierPlugin.class);
		RuneLite.main(args);
		/*String request = String.format("{ \"embeds\": [{ \"author\": {\"name\": \"%s\", \"icon_url\": " +
						"\"%s\" }, \"description\": \"%s\", \"color\": %d, \"footer\": { \"text\": \"%s\" } }] }", "Test",
				"https://oldschool.runescape.wiki/images/Quest_point_icon.png", "Just Completed the ["
						+ "The Grand Tree" + "](https://oldschool.runescape.wiki/w/" + "The Grand Tree"
						.replace(" ", "_") + ") Quest!", 1175562, "Awarded " + 1 + " Quest Point");
		DiscordWebhook.sendRequest("", request);*/
	}
}