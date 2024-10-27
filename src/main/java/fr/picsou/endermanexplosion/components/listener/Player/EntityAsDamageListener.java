package fr.picsou.endermanexplosion.components.listener.Player;

import net.minecraft.world.level.Explosion;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_20_R2.entity.CraftEnderman;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityAsDamageListener implements Listener {

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {
        if (event.getEntity().getCustomName() != null){
            if (event.getEntity().getCustomName().equals(ChatColor.RED + "Bombardier")){
                if (event.getCause()== EntityDamageEvent.DamageCause.BLOCK_EXPLOSION){
                    event.setCancelled(true);
                }
            }
        }

    }
}
