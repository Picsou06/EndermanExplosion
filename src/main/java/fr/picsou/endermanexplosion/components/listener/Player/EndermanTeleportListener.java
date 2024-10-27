package fr.picsou.endermanexplosion.components.listener.Player;

import net.minecraft.world.level.Explosion;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_20_R2.entity.CraftEnderman;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;

public class EndermanTeleportListener implements Listener {

    @EventHandler
    public void OnEndermanTeleport(EntityTeleportEvent event) {
        if (event.getEntity().getCustomName() != null){
            if (event.getEntity().getName().equals(ChatColor.RED + "Bombardier")){
                event.setCancelled(true);
            }
        }
    }
}
