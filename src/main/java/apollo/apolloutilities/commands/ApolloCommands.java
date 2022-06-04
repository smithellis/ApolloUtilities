package apollo.apolloutilities.commands;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
        return true;
    }
}
