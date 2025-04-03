package src.main.java.io.github.Brensono.TestPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin{
    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC!");
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC!");
    }
}
