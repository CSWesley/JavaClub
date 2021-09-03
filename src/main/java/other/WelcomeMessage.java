package other;

import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class WelcomeMessage extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent e) {
        Objects.requireNonNull(e.getGuild().getDefaultChannel()).sendMessage("Welcome to the server, **" + Objects.requireNonNull(e.getMember()).getEffectiveName() + "**!").queue();
    }
}
