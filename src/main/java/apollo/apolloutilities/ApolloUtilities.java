package apollo.apolloutilities;

import apollo.apolloutilities.commands.ApolloCommands;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ApolloUtilities extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        //define where to execute command
        ApolloCommands commands = new ApolloCommands();

        //message on start up
        System.out.println(ChatColor.GOLD + "Apollo Utilities Is Running!");

        //event listener
        getServer().getPluginManager().registerEvents(this,this);

        //hub command
        getCommand("hub").setExecutor(commands);
        getCommand("stream").setExecutor(commands);
        getCommand("ranks").setExecutor(commands);
    }

    //event when player joins (sets a new join message with color)
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.LIGHT_PURPLE + "Welcome to the Apollo Network " + ChatColor.GREEN + event.getPlayer().getDisplayName() + ChatColor.LIGHT_PURPLE + "!");
        Player player = event.getPlayer();
        player.setGravity(true);
    }




    //all information saves and plugins sends the stop message
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.GOLD + "Apollo Utilities Is Saving Data Then Shutting Down!");
    }
}
