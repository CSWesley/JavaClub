package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Resources extends ListenerAdapter {

    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder()
                .setTitle("Resources • JavaClub")
                .setAuthor(e.getAuthor().getName())
                .setColor(Color.RED)
                .addField("Resources", "Here are some helpful links that will help you learn more Java!\n" +
                        "\n" +
                        "Codecademy: <https://www.codecademy.com/learn/learn-java>\n" +
                        "Oracle: <https://docs.oracle.com/javase/tutorial/>", false)
                .setFooter(e.getAuthor().getName() + "   ª•ª   " + formatter.format(date));

        if (e.getMessage().getContentRaw().equalsIgnoreCase("!java") || e.getMessage().getContentRaw().equalsIgnoreCase("!resources")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }

    }
}
