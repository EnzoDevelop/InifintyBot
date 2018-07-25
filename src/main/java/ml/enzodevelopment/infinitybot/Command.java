package ml.enzodevelopment.infinitybot;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public interface Command {
    void execute(String[] args, GuildMessageReceivedEvent event);

    String getUsage();

    String getDesc();

    List<String> getAliases();

    String getType();
}



