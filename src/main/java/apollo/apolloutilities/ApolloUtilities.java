package apollo.apolloutilities;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ApolloUtilities extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Apollo Utilities Is Running Correctly!");
        Objects.requireNonNull(getServer().getPluginCommand("mark-location")).setExecutor(new TowerExecutor());

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        getServer().getPluginManager().registerEvents(this, this);
        event.setJoinMessage("Hey there, shizzle.");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Apollo Utilities Is Saving Data Then Shutting Down!");
    }
}
