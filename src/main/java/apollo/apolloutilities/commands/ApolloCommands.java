package apollo.apolloutilities.commands;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent;

import java.util.Arrays;
import java.util.Locale;

public class ApolloCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {sender.sendMessage("Please only use this as a player!");}
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("hub")) {
            player.performCommand("warp lobby");
            sender.sendMessage(ChatColor.GOLD + "(!) " + ChatColor.LIGHT_PURPLE + "Attempting to send you to the lobby...");
        }
        if (cmd.getName().equalsIgnoreCase("stream")) {
            sender.sendMessage(ChatColor.GOLD + "(!) " + ChatColor.LIGHT_PURPLE + "Go watch Herculuke on twitch (even if he isn't live): https://www.twitch.tv/herculuke");
        }
        if (cmd.getName().equalsIgnoreCase("ranks")) {
            sender.sendMessage(ChatColor.GOLD + "(!) " + ChatColor.LIGHT_PURPLE + "All ranks and perks available to buy here: https://apollo-shop.tebex.io/category/ranks");
        }
        if (cmd.getName().equalsIgnoreCase("goaway")) {
            if (sender.isOp() == true) {
                Player target = Bukkit.getServer().getPlayer(args[0]);
                target.getName();
                sender.sendMessage(ChatColor.GOLD + "(!) " + ChatColor.LIGHT_PURPLE + "Attempting to make " + ChatColor.GREEN + target.getDisplayName() + ChatColor.LIGHT_PURPLE + " go away");
                Location loc = new Location(Bukkit.getWorld("viewersmp"), 8000, 100, 10000, 100, 100);
                target.teleport(loc);
            }
            sender.sendMessage(ChatColor.GOLD + "(!) " + ChatColor.LIGHT_PURPLE + "You do not have perms you idiot");
        }
        return true;
    }
}
