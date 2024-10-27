package fr.picsou.endermanexplosion;

import fr.picsou.endermanexplosion.components.listener.ListenerManager;
import fr.picsou.endermanexplosion.utils.Commands.SimpleCommand;
import org.bukkit.craftbukkit.v1_20_R2.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;

    @Override
    public void onEnable(){
        instance = this;
        System.out.println("[EndermanExplosion] ON");
        new ListenerManager(this);
    }

    @Override
    public void onDisable() {
        System.out.println("[EndermanExplosion] OFF");
    }
    private void createCommand(SimpleCommand command) {
        CraftServer server = (CraftServer) getServer();
        server.getCommandMap().register(getName(), command);
    }

    public static Main getInstance() {
        return instance;
    }
    }

