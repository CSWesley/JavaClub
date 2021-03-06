import commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import other.WelcomeMessage;

import javax.security.auth.login.LoginException;

public class JavaClub {

    public static void main(String[] args) {

        JDABuilder jdaBuilder = JDABuilder.createDefault(System.getenv().get("TOKEN")).setActivity(Activity.playing("Helping with the Java Club"));
        jdaBuilder.addEventListeners(new Help(), new Src(), new Info(), new Schedule(), new Resources(), new Aliases(), new WelcomeMessage());
        JDA jda = null;
        try {
            jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
        try {
            jda.awaitReady();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
