package fr.picsou.endermanexplosion.components.listener;

import fr.picsou.endermanexplosion.components.listener.Player.*;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenerManager {

    public ListenerManager(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new PlayerAsDamageByEntityListener(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new EntityAsDamageListener(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new EndermanTeleportListener(), plugin);
    }
}
