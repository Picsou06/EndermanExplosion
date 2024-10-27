package fr.picsou.endermanexplosion.components.listener.Player;

import net.minecraft.world.level.Explosion;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_20_R2.entity.CraftEnderman;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerAsDamageByEntityListener implements Listener {

    @EventHandler
    public void onPlayerDamage(EntityDamageByEntityEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (event.getDamager() instanceof Explosion) {
                event.setCancelled(true);
            }
            double n = (int) (Math.random() * 10);
            if (event.getDamager() instanceof CraftEnderman && n == 9) {
                event.getDamager().setCustomName(ChatColor.RED + "Bombardier");
                PotionEffect speed = new PotionEffect(PotionEffectType.SPEED, -1, 1, false, false);
                ((CraftEnderman) event.getDamager()).addPotionEffect(speed);
                event.getDamager().setCustomNameVisible(true);
            }
            if (event.getDamager().getCustomName() != null){
                if (event.getDamager() instanceof CraftEnderman && event.getDamager().getCustomName().equals(ChatColor.RED + "Bombardier")) {
                    World w = player.getWorld();
                    Location loc = event.getDamager().getLocation();
                    w.createExplosion(loc, 1, false);
                }
            }
        }
    }
}
