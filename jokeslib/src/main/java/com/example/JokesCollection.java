package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokesCollection {

    private ArrayList<String> jokesList;


    private ArrayList<String> init() {
        jokesList = new ArrayList<>();
        jokesList.add(0, "\n" +
                "One employee of the pharma company goes to his boss and asks for leave. \"Sir, my wife is pregnant and is unable to do the household work. I think I must go there and help her. Please give me one week's leave.\"\n" +
                "\n" +
                "The boss says, \"It is just the last evening that your wife telephoned me and asked not to send you home under any circumstances. She said that every time you go home, you get drunk and create nuisance. So, your leave is not granted...\"\n" +
                "\n" +
                "The employee said, \"OK sir,\" and started to leave...\n" +
                "\n" +
                "But paused at the door he said, \"Sir I've one more point.\"\n" +
                "\n" +
                "The boss said, \"OK, go on.\"\n" +
                "v \"Sir, Don't you think we two are the best liars in the world\", he said.\n" +
                "\n" +
                "\"Why do you say so?\" inquired the boss.\n" +
                "\n" +
                "\"I am not married yet sir.\"");

        jokesList.add(1, "The local bar was so sure that its bartender was the strongest man around that they offered a standing Rs.1000/- bet.\n" +
                "\n" +
                "The bartender would squeeze a lemon until all the juice ran into a glass, and hand the lemon to a patron. Anyone who could squeeze one more drop of juice out would win the money.\n" +
                "\n" +
                "Many people had tried.... over time: weightlifters, longshoremen, etc., but nobody could do it.\n" +
                "\n" +
                "One day, this scrawny little fellow came into the bar, wearing thick glasses and a polyester suit, and said in a small voice, \"I'd like to try the bet.\"\n" +
                "\n" +
                "After the laughter had died down, the bartender said, \"OK!\"; grabbed the lemon; and squeezed away. Then he handed the wrinkled remains of the rind to the little fellow.\n" +
                "\n" +
                "But the Crowd's laughter turned to total silence.... as the man clenched his little fist around the lemon.... and six drops fell into the glass.\n" +
                "\n" +
                "As the crowd cheered, the bartender paid the little man Rs.1000/-, and asked him, \"What do you do for a living? Are you a wrestler, a weight-lifter, or what?\"\n" +
                "\n" +
                "The little fellow quietly replied, \"I WORK FOR THE GST DEPARTMENT.\"");


        jokesList.add(2, "Father Murphy was playing golf with a parishioner.\n" +
                "\n" +
                "On the first hole, he sliced into the rough.\n" +
                "\n" +
                "His opponent heard him mutter \"Hoover !\" under his breath.\n" +
                "\n" +
                "On the second hole, Father Murphy's ball went straight into a water hazard.\n" +
                "\n" +
                "\"Hoover!\" again a little louder this time.\n" +
                "\n" +
                "On the third hole, a miracle occured and Father Murphy's drive landed on the green only six inches from the hole !\n" +
                "\n" +
                "\"Praise be to God !\"\n" +
                "\n" +
                "He carefully lined up the putt, but the ball curved around the hole instead of going in. \"HOOVER !!!\"\n" +
                "\n" +
                "By this time, his opponent couldn't withhold his curiosity any longer, and asked why the priest said \"Hoover\".\n" +
                "\n" +
                "\"It's the biggest dam I know.\"\n" +
                "\n" +
                "Dam(n)");

        jokesList.add(3, "A man went into a bank and asked to borrow three thousand dollars for a month. The loan officer asked what collateral the man had.\n" +
                "\n" +
                "He replied: 'I've got a Rolls-Royce. Keep it until the loan is paid off. Here are the keys.'\n" +
                "\n" +
                "The loan officer arranged for the vehicle to be driven into the bank's underground car park for safekeeping and gave the man the fifteen hundred dollars.\n" +
                "\n" +
                "A month later, the man returned to the bank, repaid the fifteen-hundred-dollar loan plus ten dollars interest and retook possession of his Rolls-Royce.\n" +
                "\n" +
                "The loan officer was puzzled. 'There's one thing I don't understand, sir,' he said. 'Why would someone who drives a Rolls-Royce need to borrow fifteen hundred dollars?'\n" +
                "\n" +
                "The man replied: 'I had to go abroad for a month and where else could I store a Rolls-Royce for that length of time for ten dollars?'");
        return jokesList;
    }

    public String getJokes() {

        ArrayList<String> jokesList = init();
        String joke;
        Random random = new Random();
        joke = jokesList.get(random.nextInt(jokesList.size()));
        return joke;
    }
}
