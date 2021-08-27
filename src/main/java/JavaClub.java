import commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class JavaClub {

    public static void main(String[] args) {

        JDABuilder jdaBuilder = JDABuilder.createDefault("ODgwMjgzMzYyMDM4Nzc5OTA0.YScBxA.ukpR-82iMejPJL97pITykrlDrGg").setActivity(Activity.playing("Helping with the Java Club"));
        jdaBuilder.addEventListeners(new Help(), new Src(), new Info(), new Schedule(), new Resources(), new Aliases());
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
