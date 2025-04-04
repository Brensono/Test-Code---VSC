package src.main.java.io.papermc.testplugin;

import java.lang.Object;
import org.bukkit.plugin.PluginBase;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        getLogger().info("Hello, PaperMC!");
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, PaperMC!");
    }
}

