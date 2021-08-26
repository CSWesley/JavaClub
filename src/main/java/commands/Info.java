package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Info extends ListenerAdapter {

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if (e.getMessage().getContentRaw().equalsIgnoreCase("!info")) {

            EmbedBuilder eb = new EmbedBuilder()
                    .setTitle("Information • JavaClub")
                    .setAuthor(e.getAuthor().getName())
                    .setColor(Color.RED)
                    .addField("Info", "This bot was made by `Wesley_` for the Java Club at Ocean Grove School. This bot is under the Apache 2.0 License and is open source.\n", true)
                    .addField("Bot Info", "This source code to this bot is available to anyone wishing to view it. Use the command **!src** to get the github link.", true)
                    .setFooter(e.getAuthor().getName() + "   ª•ª   " + formatter.format(date));

            if (e.getMessage().getContentRaw().equalsIgnoreCase("!info")) {
                e.getChannel().sendMessage(eb.build()).queue();
            }
        }
    }
}
