package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Aliases extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        EmbedBuilder eb = new EmbedBuilder()
                // Add embed then finish this bot for a few
                .setTitle("Test");


        if (e.getMessage().getContentRaw().equalsIgnoreCase("!alias")) {
            e.getChannel().sendMessage(eb.build()).queue();
        }


    }
}
