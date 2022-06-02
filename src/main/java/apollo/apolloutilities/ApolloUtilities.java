package apollo.apolloutilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PiglinBarterEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

public final class ApolloUtilities extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GOLD + "Apollo Utilities Is Running Correctly!");
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.LIGHT_PURPLE + "Welcome to the Apollo Network " + ChatColor.GREEN + event.getPlayer().getDisplayName() + ChatColor.LIGHT_PURPLE + "!");
    }

    @EventHandler
    public final Enchantment DAMAGE_ALL;
    @EventHandler
    public void onItemCrafted (PrepareItemCraftEvent e) {
        e.getInventory().setResult(new ItemStack(Material.DIAMOND_SWORD).addEnchantment(Enchantment.getByKey(new NamespacedKey(EnchantmentWrapper.DAMAGE_ALL)));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.GOLD + "Apollo Utilities Is Saving Data Then Shutting Down!");
    }
}
