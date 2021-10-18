package com.discordnotifier;

import com.google.gson.JsonObject;
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import java.io.IOException;

@Slf4j
@PluginDescriptor(
	name = "Discord Notifier"
)
public class DiscordNotifierPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private DiscordNotifierConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onChatMessage(ChatMessage chatMessage) throws IOException {
		if (chatMessage.getType() == ChatMessageType.GAMEMESSAGE){
			if (config.questEnable()) {
				if (chatMessage.getMessage().startsWith("You've started a new quest:")) {
					String msg = chatMessage.getMessage();
					System.out.print(msg);
					String questStarted = msg.substring(0, msg.indexOf("</")).substring(msg.indexOf('>') + 1);
					System.out.print(questStarted);
					Quest quest = QuestData.findQuest(questStarted);
					if (config.onQuestStart() && ((config.questTypesEnabled().contains(quest.getDifficulty()) ||
							(config.questTypesEnabled().contains("freetoplay") && quest.getFreeToPlay() == true))) &&
							(quest.getQuestPoints() >= config.questPointMinimum())) {
						String request = String.format("{ \"embeds\": [{ \"author\": {\"name\": \"%s\", \"icon_url\": " +
								"\"%s\" }, \"description\": \"%s\", \"color\": %d }] }", client.getLocalPlayer().getName(),
								"https://oldschool.runescape.wiki/images/Quest_point_icon.png", "Just Started the ["
										+ quest.getName() + "](https://oldschool.runescape.wiki/w/" + quest.getName()
										.replace(" ", "_") + ") Quest!", 15459636);
						DiscordWebhook.sendRequest(config.webhookURL(), request);
					}
				}
				else if (chatMessage.getMessage().startsWith("Congratulations, you've completed a quest:")) {
					String msg = chatMessage.getMessage();
					System.out.print(msg);
					String questComplete = msg.substring(0, msg.indexOf("</")).substring(msg.indexOf('>') + 1);
					System.out.print(questComplete);
					Quest quest = QuestData.findQuest(questComplete);
					if (((config.questTypesEnabled().contains(quest.getDifficulty()) ||
							(config.questTypesEnabled().contains("freetoplay") && quest.getFreeToPlay() == true))) &&
							(quest.getQuestPoints() >= config.questPointMinimum())) {
						String request = String.format("{ \"embeds\": [{ \"author\": {\"name\": \"%s\", \"icon_url\": " +
										"\"%s\" }, \"description\": \"%s\", \"color\": %d }] }", client.getLocalPlayer().getName(),
								"https://oldschool.runescape.wiki/images/Quest_point_icon.png", "Just Completed the ["
										+ quest.getName() + "](https://oldschool.runescape.wiki/w/" + quest.getName()
										.replace(" ", "_") + ") Quest!", 1175562);
						DiscordWebhook.sendRequest(config.webhookURL(), request);
					}
				}
			}
		}
	}

	@Provides
	DiscordNotifierConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(DiscordNotifierConfig.class);
	}
}
