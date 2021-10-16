package com.discordnotifier;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("example")
public interface DiscordNotifierConfig extends Config
{
	@ConfigSection(
			position = 1,
			name = "Webhook Settings",
			description = "Settings pertaining to the webhook"
	)
	String webhookSettings = "webhookSettings";

	@ConfigItem(
			keyName = "webhookurl",
			name = "Webhook URL(s)",
			description = "Discord Webhook URLs, each on their own line",
			section = webhookSettings,
			position = 1
	)
	default String webhookURL(){
		return "";
	}

	@ConfigSection(
			position = 2,
			name = "Quest Settings",
			description = "Settings pertaining to the quest notifications"
	)
	String questSettings = "questSettings";

	@ConfigItem(
			keyName = "questenable",
			name = "Enable Quest Notifications",
			description = "Whether or not to send quest notifications",
			section = questSettings,
			position = 1
	)
	default boolean questEnable(){
		return true;
	}

	@ConfigItem(
			keyName = "questsendscreenshot",
			name = "Send Screenshot",
			description = "Whether or not to send a screenshot with the notification",
			section = questSettings,
			position = 2
	)
	default boolean questSendScreenshot(){
		return false;
	}

	@ConfigItem(
			keyName = "questtypesenabled",
			name = "Enabled Quest Types",
			description = "Which quest types to send notifications for (separated by commas); the types are as follows: " +
					"f2p (Free to Play), Member, Novice, Intermediate, Experienced, Master, Grandmaster, Special, Miniquest",
			section = questSettings,
			position = 3
	)
	default String questTypesEnabled(){
		return "f2p,member,novice,intermediate,experienced,master,grandmaster,special,miniquest";
	}

	@ConfigItem(
			keyName = "questpointminimum",
			name = "Quest Point Minimum",
			description = "Minimum amount of quest points necessary to send a notification",
			section = questSettings,
			position = 4
	)
	default int questPointMinimum(){
		return 1;
	}
}
