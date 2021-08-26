import commands.Help;
import commands.Info;
<<<<<<< HEAD
=======
import commands.Meme;
>>>>>>> Initial Commit.
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class JavaClub {

    public static void main(String[] args) {

        JDABuilder jdaBuilder = JDABuilder.createDefault(System.getenv().get("TOKEN")).setActivity(Activity.playing("Helping with the Java Club"));
<<<<<<< HEAD
        jdaBuilder.addEventListeners(new Help(), new Info());
=======
        jdaBuilder.addEventListeners(new Help(), new Meme(), new Info());
>>>>>>> Initial Commit.
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
