package com.example.android.jokelib;

import java.util.Random;

public class JokeProvider {
    public static final String[] jokes={
            " What does the zero say to the eight?\n" +
                    " Nice belt!",
            "What travels around the world but stays in one corner?\n" +
                    " A stamp.",
            " Why should you stand in the corner if you get cold?\n" +
                    "A: It is always 90 degrees.",
            "Why didn\'t the sun go to college?\n" +
                    " Because it already had a million degrees!",
            "Why couldn\'t the astronaut book a room on the moon?\n" +
                    "A: It was full!",
            "I get plenty of exercise – jumping to conclusions, pushing my luck, and dodging deadlines.",
            "Why did the crab never share?\n" +
                    " Because he\'s shellfish",
            "My email password has been hacked. That\'s the third time I've had to rename the cat.",
            "I rang the doctor and said, Quick! My pregnant wife is going into labor, what should I do?\n" +
                    "He said, Is this her first child?\n" +
                    "I said, No, this is her husband.",
            "My wife apologized for the first time ever today.\n" +
                    "She said she\'s sorry she ever married me.",
            "My wife thinks I don\'t respect her privacy enough.\n" +
                    "At least, that\'s what it says in her diary.",
            "Q: Daddy, why are all those cars beeping their horns?\n" +
                    "A: Because there\'s a wedding going happening.\n" +
                    "Q: Don\'t we been the horn a warning signal, Daddy?\n" +
                    "A: Exactly, son.",
            "MATH stands for Mental Abuse To Humans."

    };
    public static String tellJoke(){
        String random = (jokes[new Random().nextInt(jokes.length)]);
        return random;
    }
}
