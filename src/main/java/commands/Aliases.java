package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aliases extends ListenerAdapter {

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder()
                // Add embed then finish this bot for a few
                .setTitle("Aliases • JavaClub")
                .setAuthor(e.getAuthor().getName())
                .setColor(Color.RED)
                .addField("Aliases", "**!help** => **!h**\n" +
                        "**!schedule** => **!sched**\n" +
                        "**!java** => **!resources**\n", false)
                .setFooter(e.getAuthor().getName() + "   ª•ª   " + formatter.format(date));


        if (e.getMessage().getContentRaw().equalsIgnoreCase("!alias")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }


    }
}
