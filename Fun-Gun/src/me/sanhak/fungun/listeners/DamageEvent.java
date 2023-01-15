package me.sanhak.fungun.listeners;

import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>DamageEvent</b> class , It contains a little methods and functions that
 * help the plug-in to safe entities from snowball damage <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class DamageEvent implements Listener { // Start

	// This event to disable a snowball damage !
	@EventHandler
	public void DisableDamage(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Snowball) {
			e.setCancelled(true);
		}
	}

} // End
