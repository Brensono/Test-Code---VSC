package io.papermc.testplugin;

import java.lang.Object;
import net.kyori.adventure.text.Component;
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
        getLogger().info("Hello PaperMC!");
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, PaperMC!");
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(("Hello, " + event.getPlayer().getName() + "!"));
    }
}


