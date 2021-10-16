package com.nas.autocomplete.util;

import java.util.ArrayList;
import java.util.List;

import com.nas.autocomplete.restservice.Title;

public class BookTitleGenerator {

    public static List<Title> getTitles() {
        ArrayList<Title> titleList = new ArrayList<Title>();

        for (int i = 0; i < titles.length; i++) {
            titleList.add(new Title(i, titles[i]));
        }

        return titleList;
    }

    private static String[] titles = { "Challenge Of The Hunter", "Chasing My Enemies", "Life At The Mines",
            "Battle Of My Friends", "Traces In The Shadows", "Learning From The Sun", "Commanding My Past",
            "Losing The Light", "Losing The King", "Rejecting The Emperor", "Jumping Into The City",
            "Whispers In The Void", "Smile At My Nightmares", "Possessed By My Enemies", "Changing The Light",
            "Wrong About The East", "Hiding My Future", "Bleeding In The Graveyard", "Deceiving My Enemies",
            "Dead In The Maze", "Call To The Titans", "Vanish In The Beginning", "Healing My Family",
            "Memory Of The Mines", "Blinded In My Husband", "Painting History", "Going To The Beginning",
            "Symbols Of The Darkness", "Rejecting The Ships", "Preparing For The Leaders", "Rescue In Secrets",
            "Amusing Technology", "Death At The Swamp", "Memory Of The Graveyard", "Shelter In The East",
            "Separated In My Enemies", "Reach Of My Wife", "Hunting The Sun", "Pleasing The North",
            "Laughing At The Void", "Smile At The End", "Separated By The Slaves", "Learning From The River",
            "Painting The Ships", "Rescue In My Wife", "Bathing In Secrets", "Write About The Past",
            "Jumping Into The City", "Binding To My Wife", "Bleeding In My Family", "Shelter In My Enemies",
            "Blood At Secrets", "Crying In The Abyss", "Binding To The Hunter", "Kicking The Mines",
            "Meeting At The Maze", "Awakening My Enemies", "Belonging To The Past", "Guarding The Leaders",
            "Becoming The Future", "Breath Of The Castle", "Culmination Of Insanity", "Weep For The Nation",
            "Separated By The Commander", "Signs At My Friends", "Leading The Beginning", "Taste Of The Mountains",
            "Chasing Eternity", "Accepting The Dungeons", "Delaying The Fires", "Scared At The Ships",
            "Meeting In The Jungle", "Meeting In The Jungle", "Eating At The Light", "Separated In Time",
            "Vanishing Into The Angels", "Challenging The Country", "Searching In Myself", "Life At The Shadows",
            "Taste Of Time", "Fighting The Castle", "Rejecting The River", "Praised By The World",
            "Never Trust The Animals", "Temptations Of The Nation", "Possessed By The Castle", "Punished By The Castle",
            "Searching In My Dreams", "Enhancing The Jungle", "Battle Of The South", "Separated In The Immortals",
            "Battling In My Friends", "Shelter In The End", "Tower Of The Void", "Becoming My Enemies",
            "Praise Secrets", "Running In My School", "Death In The Immortals", "Eating At The East",
            "Answering The Fog", "Whispers In The North", "Death At My School", "Bleeding At The Dark",
            "Remember The Depths", "Sounds In The Void", "Bound To A Storm", "Shelter At The World",
            "Still Breathing In The Universe", "Faith Of My Future", "Write About The Past", "Never Trust My Friends",
            "Meeting At The Dark", "Crying In A Storm", "Eliminating The Moon", "Going To Myself",
            "Separated At The Future", "Temptations Of The Sea", "Cleaning Up My Friends", "Going To The Universe",
            "Eliminating My Home", "Prepare For The Beginning", "Traces In The River", "Guarded By My Future",
            "Belonging To The Apocolypse", "Lurking In The Elements", "Flying Into The Ashes",
            "Whispers Of The Emperor", "Chasing The East", "Travel To The Demons", "Separated By The Nation",
            "Right About The Forest", "Possessed By The Castle", "Travel To The Titans", "Hurting The Demons",
            "Admiring Dreams", "Origin Of The Universe", "Controlling My Leader", "Blood In My Dreams",
            "Destroying The Mountains", "Avoiding Secrets", "Becoming My Future", "Learning From The South",
            "Write About The Apocolypse", "Growing In My Nightmares", "Dancing In The Castle", "Vanish At The Fires",
            "Controlling The Darkness", "Whispers In The Sea", "Temptations Of My End", "Taste Of Myself",
            "Arriving At The King", "Right About My End", "Painting The Ships", "Possessed By My Nightmares",
            "Crying In The Past", "Fade Into The Sun", "Hurting The Void", "Sailing Into The Void", "Force Of The City",
            "Possessed By The Castle", "Remember History", "Guarding The Leaders", "Wrong About The Ocean",
            "Escape My Future", "Growing In My End", "Bleeding In The East", "Blinded In Time", "Traces In The East",
            "Leading History", "Eating At The Fires", "Deceiving The North", "Delaying The Ocean",
            "Never Trust Eternity", "Separated In The Demons", "Praised By The Abyss", "Helping The Moon",
            "Enhancing Secrets", "Rescue In Secrets", "Cleaning Up The Slaves", "Adopting Myself", "Becoming My Future",
            "Searching At The Void", "Raised By The Beginning", "Crying In Nightmares", "Temptations In The Town",
            "Cleaning Up The Slaves", "Healing The Immortals", "Write About The Past", "Smile At The Angels",
            "Prepare For My Husband", "Arriving At My Wife", "Hunting The Sun", "Raised By Dreams",
            "Blood At The Jungle", "Hiding The Light", "Answering The Moon", "Vanish In The Mines",
            "Crying In The Stars", "Whispers In The North", "Eating At The Fires", "Taste Of The Mountains",
            "Pleasing The North", "Controlling The Darkness", "Searching For Myself", "Challenge Of The Elements",
            "Losing My Family", "Blinded In The Dungeons", "Separated By The Town", "Separated In The Fires",
            "Escaping The Sea", "Separated In Technology", "Destroying My Nightmares", "Eliminating The Animals",
            "Traces In The East", "Temptations In The Dark", "Confessions Of The East", "Learning From The Sea",
            "Preparing For The Immortals", "Death In The Immortals", "Pleasing The Ocean",
            "Vanishing Into The Commander", "Death At Eternity", "Bathing In The Emperor", "Smiles In The Shadows",
            "Chasing The World", "Eliminating The Moon", "Meeting At The Animals", "Mending Technology",
            "Screams At My Nightmares", "Temptations In The Mountains", "Battling In The Sun", "Meeting In The Jungle",
            "Kicking The Mines", "Challenging The Country", "Choking In The Swamp", "Dwelling In The Forest",
            "Sounds Of The Moon", "Death In The King", "Raised By Dreams", "Bleeding At The Dark" };
}
