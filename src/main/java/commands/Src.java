package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Src extends ListenerAdapter {

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder()
                .setTitle("Src • JavaClub")
                .setAuthor(e.getAuthor().getName())
                .setColor(Color.RED)
                .addField("Src", "To view the source code in this bot, go to this github link: **<https://github.com/Booked61/JavaClub>**. Note that this bot is hosted by heroku.", false)
                .setFooter(e.getAuthor().getName() + "   ª•ª   " + formatter.format(date));

        if (e.getMessage().getContentRaw().equalsIgnoreCase("!src")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }
    }
}
