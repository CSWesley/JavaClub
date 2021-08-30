package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Schedule extends ListenerAdapter {

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder()
                .setTitle("Schedule • JavaClub")
                .setAuthor(e.getAuthor().getName())
                .setColor(Color.RED)
                .addField("Schedule", "Monday, September 27th at noon\n" +
                        "Monday, October 25th at noon\n" +
                        "Monday, November 29th at noon\n" +
                        "(Skipping December)\n" +
                        "(Skipping January 10th)\n" +
                        "Monday, January 24th at noon\n" +
                        "Monday, February 7th at noon\n" +
                        "Monday, March 7th at noon\n" +
                        "Monday, April 4th at noon\n" +
                        "Monday, May 16th at noon\n", false)
                .addField("Unless...", "When the club is over and if you want to learn more about Java, contact the club president/leader, `Wesley_#8643`!", false)
                .setFooter(e.getAuthor().getName() + "   ª•ª   " + formatter.format(date));

        if (e.getMessage().getContentRaw().equalsIgnoreCase("!schedule") || e.getMessage().getContentRaw().equalsIgnoreCase("!sched")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }
    }
}
