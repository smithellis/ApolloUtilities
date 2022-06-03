package apollo.apolloutilities.commands;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class ApolloCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("hub".toLowerCase(Locale.ROOT))) {
                player.performCommand("warp lobby");
            }
        }

        System.out.println("Please only use this as a player!");

        return true;
    }
}
