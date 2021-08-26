package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;
import java.util.Random;

public class Meme extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {


        // /Users/Wesley/Desktop/Memes/FILE_NAME/

        // Had to go into backup drive to get these files lmao

        File meme1 = new File("/Users/Wesley/Desktop/Memes/meme1.png/");
        File meme2 = new File("/Users/Wesley/Desktop/Memes/meme2.png/");
        File meme3 = new File("/Users/Wesley/Desktop/Memes/meme3.png/");
        File meme4 = new File("/Users/Wesley/Desktop/Memes/meme4.png/");
        File meme5 = new File("/Users/Wesley/Desktop/Memes/meme5.png/");
        File meme6 = new File("/Users/Wesley/Desktop/Memes/meme6.png/");
        File meme7 = new File("/Users/Wesley/Desktop/Memes/meme7.png/");
        File meme9 = new File("/Users/Wesley/Desktop/Memes/meme8.png/");
        File meme10 = new File("/Users/Wesley/Desktop/Memes/meme9.png/");
        File meme11 = new File("/Users/Wesley/Desktop/Memes/meme10.png/");
        File meme12 = new File("/Users/Wesley/Desktop/Memes/meme11.png/");
        File meme13 = new File("/Users/Wesley/Desktop/Memes/meme12.png/");
        File meme14 = new File("/Users/Wesley/Desktop/Memes/meme13.png/");
        File meme15 = new File("/Users/Wesley/Desktop/Memes/meme14.png/");
        File meme16 = new File("/Users/Wesley/Desktop/Memes/meme15.png/");
        File meme17 = new File("/Users/Wesley/Desktop/Memes/meme16.png/");
        File meme18 = new File("/Users/Wesley/Desktop/Memes/meme17.png/");
        File meme19 = new File("/Users/Wesley/Desktop/Memes/meme18.png/");
        File meme8 = new File("/Users/Wesley/Desktop/Memes/meme19.png/");
        File meme20 = new File("/Users/Wesley/Desktop/Memes/meme20.png/");
        File meme21 = new File("/Users/Wesley/Desktop/Memes/meme21.png/");
        File meme22 = new File("/Users/Wesley/Desktop/Memes/meme22.png/");
        File meme23 = new File("/Users/Wesley/Desktop/Memes/meme23.png/");
        File meme24 = new File("/Users/Wesley/Desktop/Memes/meme24.png/");
        File meme25 = new File("/Users/Wesley/Desktop/Memes/meme25.png/");
        File meme26 = new File("/Users/Wesley/Desktop/Memes/meme26.png/");
        File meme27 = new File("/Users/Wesley/Desktop/Memes/meme27.png/");
        File meme28 = new File("/Users/Wesley/Desktop/Memes/meme28.png/");
        File meme29 = new File("/Users/Wesley/Desktop/Memes/meme29.png/");

        File [] arr = {
                meme1, meme2, meme3, meme4, meme5, meme6, meme7, meme8, meme9, meme10, meme11, meme12, meme13, meme14, meme15, meme16, meme17, meme18, meme19, meme20,
                meme21, meme22, meme23, meme24, meme25, meme26, meme27, meme28, meme29
        };

        Random random = new Random();
        int select = random.nextInt(arr.length);

        if (e.getMessage().getContentRaw().equalsIgnoreCase("!meme")) {
            e.getChannel().sendFile(arr[select]).queue();
        }








    }
}
