package com.discordnotifier;

import java.util.Arrays;
import java.util.List;

public class QuestData {
    private static List<Quest> quests = Arrays.asList(
            //Free to play quests
            new Quest("Below Ice Mountain", true, "novice", 1, "2000 Coins," +
                    "Access to the Ruins of Camdozaal"),
            new Quest("Black Knight's Fortress", true, "novice", 3, "2500 Coins"),
            new Quest("Cook's Assistant", true, "novice", 1, "300 Cooking XP"),
            new Quest("The Corsair Curse", true, "novice", 2, "Corsair Cove Bank Access"),
            new Quest("Demon Slayer", true, "novice", 3, "Silverlight"),
            new Quest("Doric's Quest", true, "novice", 1, "1300 Mining XP," +
                    "180 Coins,Use of Doric's Anvils"),
            new Quest("Dragon Slayer I", true, "experienced", 2,
                    "Ability to equip Rune and Dragon platebodies,18650 Strength XP,18650 Defence XP"),
            new Quest("Ernest the Chicken", true, "novice", 4, "300 Coins"),
            new Quest("Goblin Diplomacy", true, "novice", 5, "200 Crafting XP," +
                    "A Gold Bar"),
            new Quest("Imp Catcher", true, "novice", 1, "875 Magic XP," +
                    "An Amulet of Accuracy"),
            new Quest("The Knight's Sword", true, "intermediate", 1, "12725 Smithing XP"),
            new Quest("Misthalin Mystery", true, "novice", 1, "600 Crafting XP," +
                    "An Uncut Ruby,An Uncut Emerald,An Uncut Sapphire"),
            new Quest("Pirate's Treasure", true, "novice", 2, "One-Eyed Hector's Treasure"),
            new Quest("Prince Ali Rescue", true, "novice", 3, "700 Coins,Free use " +
                    "of the Al Kharid Toll Gate,Access to the Sorceress's Garden Thieving minigame"),
            new Quest("The Restless Ghost", true, "novice", 1, "1125 Prayer XP," +
                    "A Ghostspeak Amulet"),
            new Quest("Romeo and Juliet", true, "novice", 5, ""),
            new Quest("Rune Mysteries", true, "novice", 1, "An Air Talisman," +
                    "Rune Essence Mine Access"),
            new Quest("Sheep Shearer", true, "novice", 1, "150 Crafting XP,60 Coins"),
            new Quest("Shield of Arrav", true, "novice", 1, "600 Coins"),
            new Quest("Vampyre Slayer", true, "novice", 3, "4825 Attack XP"),
            new Quest("Witch's Potion", true, "novice", 1, "325 Magic XP"),
            new Quest("X Marks the Spot", true, "novice", 1, "An Antique Lamp," +
                    "200 Coins,A Beginner Clue Scroll"),

            //Members Quests
            new Quest("Animal Magnetism", false, "intermediate", 1,
                    "2500 Woodcutting XP,1000 Crafting, Fletching, and Slayer XP,An Ava's Device"),
            new Quest("Another Slice of H.A.M.", false, "intermediate", 1,
                    "3000 Mining and Prayer XP,An Ancient Mace,Dorgeshuun Train Access"),
            new Quest("The Ascent of Arceuus", false, "intermediate", 1, ""),
            new Quest("Between a Rock...", false, "experienced", 2, ""),
            new Quest("Big Chompy Bird Hunting", false, "intermediate", 2, ""),
            new Quest("Biohazard", false, "novice", 3, ""),
            new Quest("Bone Voyage", false, "intermediate", 1, ""),
            new Quest("Cabin Fever", false, "experienced", 2, ""),
            new Quest("Client of Kourend", false, "novice", 1, ""),
            new Quest("Clock Tower", false, "novice", 1, ""),
            new Quest("Cold War", false, "intermediate", 1, ""),
            new Quest("Contact!", false, "master", 1, ""),
            new Quest("Creature of Fenkenstrain", false, "intermediate", 2, ""),
            new Quest("Darkness of Hallowvale", false, "intermediate", 2, ""),
            new Quest("Death Plateau", false, "novice", 1, ""),
            new Quest("Death to the Dorgeshuun", false, "intermediate", 1, ""),
            new Quest("The Depths of Despair", false, "intermediate", 1, ""),
            new Quest("Desert Treasure", false, "master", 3, ""),
            new Quest("Devious Minds", false, "experienced", 1, ""),
            new Quest("The Dig Site", false, "intermediate", 2, ""),
            new Quest("Dragon Slayer II", false, "grandmaster", 5, ""),
            new Quest("Dream Mentor", false, "master", 2, ""),
            new Quest("Druidic Ritual", false, "novice", 4, ""),
            new Quest("Dwarf Cannon", false, "novice", 1, ""),
            new Quest("Eadgar's Ruse", false, "experienced", 1, ""),
            new Quest("Eagles' Peak", false, "novice", 2, ""),
            new Quest("Elemental Workshop I", false, "novice", 1, ""),
            new Quest("Elemental Workshop II", false, "intermediate", 1, ""),
            new Quest("Enakhra's Lament", false, "experienced", 2, ""),
            new Quest("Enlightened Journey", false, "intermediate", 1, ""),
            new Quest("The Eyes of Glouphrie", false, "intermediate", 2, ""),
            new Quest("Fairytale I - Growing Pains", false, "experienced", 2, ""),
            new Quest("Fairytale II - Cure a Queen", false, "experienced", 2, ""),
            new Quest("Family Crest", false, "experienced", 1, ""),
            new Quest("The Feud", false, "intermediate", 1, ""),
            new Quest("Fight Arena", false, "experienced", 2, ""),
            new Quest("Fishing Contest", false, "novice", 1, ""),
            new Quest("Forgettable Tale...", false, "intermediate", 2, ""),
            new Quest("The Forsaken Tower", false, "intermediate", 1, ""),
            new Quest("The Fremennik Exiles", false, "master", 2, ""),
            new Quest("The Fremennik Isles", false, "experienced", 1, ""),
            new Quest("The Fremennik Trials", false, "intermediate", 3, ""),
            new Quest("Garden of Tranquillity", false, "intermediate", 2, ""),
            new Quest("Gertrude's Cat", false, "novice", 1, ""),
            new Quest("Getting Ahead", false, "intermediate", 1, ""),
            new Quest("Ghosts Ahoy", false, "intermediate", 2, ""),
            new Quest("The Giant Dwarf", false, "intermediate", 2, ""),
            new Quest("The Golem", false, "intermediate", 1, ""),
            new Quest("The Grand Tree", false, "experienced", 5, ""),
            new Quest("The Great Brain Robbery", false, "experienced", 2, ""),
            new Quest("Grim Tales", false, "master", 1, ""),
            new Quest("The Hand in the Sand", false, "intermediate", 1, ""),
            new Quest("Haunted Mine", false, "experienced", 2, ""),
            new Quest("Hazeel Cult", false, "novice", 1, ""),
            new Quest("Heroes' Quest", false, "experienced", 1, ""),
            new Quest("Holy Grail", false, "intermediate", 2, ""),
            new Quest("Horror from the Deep", false, "experienced", 2, ""),
            new Quest("Icthlarin's Little Helper", false, "intermediate", 2, ""),
            new Quest("In Aid of the Myreque", false, "intermediate", 2, ""),
            new Quest("In Search of the Myreque", false, "intermediate", 2, ""),
            new Quest("Jungle Potion", false, "novice", 1, ""),
            new Quest("King's Ransom", false, "experienced", 1, ""),
            new Quest("A Kingdom Divided", false, "experienced", 2, ""),
            new Quest("Legends' Quest", false, "master", 4, ""),
            new Quest("Lost City", false, "experienced", 3, ""),
            new Quest("The Lost Tribe", false, "intermediate", 1, ""),
            new Quest("Lunar Diplomacy", false, "experienced", 2, ""),
            new Quest("Making Friends with My Arm", false, "master", 2, ""),
            new Quest("Making History", false, "intermediate", 3, ""),
            new Quest("Merlin's Crystal", false, "intermediate", 6, ""),
            new Quest("Monk's Friend", false, "novice", 1, ""),
            new Quest("Monkey Madness I", false, "master", 3, ""),
            new Quest("Monkey Madness II", false, "grandmaster", 4, ""),
            new Quest("Mountain Daughter", false, "intermediate", 2, ""),
            new Quest("Mourning's End Part I", false, "master", 2, ""),
            new Quest("Mourning's End Part II", false, "master", 2, ""),
            new Quest("Murder Mystery", false, "novice", 3, ""),
            new Quest("My Arm's Big Adventure", false, "intermediate", 1, ""),
            new Quest("Nature Spirit", false, "novice", 2, ""),
            new Quest("A Night at the Theatre", false, "master", 2, ""),
            new Quest("Observatory Quest", false, "novice", 2, ""),
            new Quest("Olaf's Quest", false, "intermediate", 1, ""),
            new Quest("One Small Favour", false, "experienced", 2, ""),
            new Quest("Plague City", false, "novice", 1, ""),
            new Quest("A Porcine of Interest", false, "novice", 1, ""),
            new Quest("Priest in Peril", false, "novice", 1, ""),
            new Quest("The Queen of Thieves", false, "intermediate", 1, ""),
            new Quest("Rag and Bone Man I", false, "novice", 1, ""),
            new Quest("Rag and Bone Man II", false, "intermediate", 1, ""),
            new Quest("Ratcatchers", false, "intermediate", 2, ""),
            new Quest("Recipe for Disaster", false, "special", 10, ""),
            new Quest("Recipe for Disaster/Another Cook's Quest", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Defeating the Culinaromancer", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing Evil Dave", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing King Awowogei", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing Pirate Pete", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing Sir Amik Varze", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing Skrach Uglogwee", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing the Goblin generals", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing the Lumbridge Guide", false, "special", 1, ""),
            new Quest("Recipe for Disaster/Freeing the Mountain Dwarf", false, "special", 1, ""),
            new Quest("Recruitment Drive", false, "novice", 1, ""),
            new Quest("Regicide", false, "master", 3, ""),
            new Quest("Roving Elves", false, "master", 1, ""),
            new Quest("Royal Trouble", false, "experienced", 1, ""),
            new Quest("Rum Deal", false, "experienced", 2, ""),
            new Quest("Scorpion Catcher", false, "intermediate", 1, ""),
            new Quest("Sea Slug", false, "intermediate", 1, ""),
            new Quest("Shades of Mort'ton", false, "intermediate", 3, ""),
            new Quest("Shadow of the Storm", false, "intermediate", 1, ""),
            new Quest("Sheep Herder", false, "novice", 4, ""),
            new Quest("Shilo Village", false, "experienced", 2, ""),
            new Quest("Sins of the Father", false, "master", 2, ""),
            new Quest("The Slug Menace", false, "intermediate", 1, ""),
            new Quest("Song of the Elves", false, "grandmaster", 4, ""),
            new Quest("A Soul's Bane", false, "novice", 1, ""),
            new Quest("Spirits of the Elid", false, "intermediate", 2, ""),
            new Quest("Swan Song", false, "master", 2, ""),
            new Quest("Tai Bwo Wannai Trio", false, "intermediate", 2, ""),
            new Quest("A Tail of Two Cats", false, "intermediate", 2, ""),
            new Quest("Tale of the Righteous", false, "intermediate", 1, ""),
            new Quest("A Taste of Hope", false, "experienced", 1, ""),
            new Quest("Tears of Guthix", false, "intermediate", 1, ""),
            new Quest("Temple of Ikov", false, "experienced", 1, ""),
            new Quest("Throne of Miscellania", false, "experienced", 1, ""),
            new Quest("The Tourist Trap", false, "intermediate", 2, ""),
            new Quest("Tower of Life", false, "novice", 2, ""),
            new Quest("Tree Gnome Village", false, "intermediate", 2, ""),
            new Quest("Tribal Totem", false, "intermediate", 1, ""),
            new Quest("Troll Romance", false, "experienced", 2, ""),
            new Quest("Troll Stronghold", false, "experienced", 1, ""),
            new Quest("Underground Pass", false, "experienced", 5, ""),
            new Quest("Wanted!", false, "intermediate", 1, ""),
            new Quest("Watchtower", false, "intermediate", 4, ""),
            new Quest("Waterfall Quest", false, "intermediate", 1, ""),
            new Quest("What Lies Below", false, "intermediate", 1, ""),
            new Quest("Witch's House", false, "intermediate", 4, ""),
            new Quest("Zogre Flesh Eaters", false, "intermediate", 1, "")
    );

    public static List<Quest> getQuests() {
        return quests;
    }

    public static Quest findQuest(String name) {
        for (int i = 0; i < quests.size(); i++) {
            if (quests.get(i).getName().equals(name)) {
                return quests.get(i);
            }
        }
        return quests.get(23);
    }
}
