package me.comp.Falldamge;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.world.WorldEvent;

public class FalldamageEntitylistener implements Listener {

	public void Falldamagelistener(Falldamage instance) {
		
	}
	
	public void onEntitiyDamage(EntityDamageEvent en) {
		if(en.getEntity()instanceof Player){
			final Player player = (Player) en.getEntity();
			Location location = player.getLocation();
			World world = player.getWorld();
		}
		if(en.getCause().equals(DamageCause.FALL) && en.getDamage() > 1 == true){
			
		}
	}
}
