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
	}
}