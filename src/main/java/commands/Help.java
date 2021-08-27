package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Help extends ListenerAdapter {

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder()
                .setTitle("Help • JavaClub")
                .setAuthor(e.getAuthor().getName())
                .setColor(Color.RED)
                .addField("Commands", "Here are the commands!\n\n" +
                        "- **!help** => Shows this menu.\n" +
                        "- **!schedule** => Shows the schedule for our club.\n" +
                        "- **!info** => Sends information about this bot.\n" +
                        "- **!src** => Sends a github link for the source code so you can look at it.\n" +
                        "- **!java** => Sends resources that will help learn Java.\n" +
                        "- **!alias** => Sends all command aliases.\n" +
                        "", true)
                .setFooter(e.getAuthor().getName() + "   ª•ª   " + formatter.format(date));


        if (e.getMessage().getContentRaw().equalsIgnoreCase("!help")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }
    }
}
