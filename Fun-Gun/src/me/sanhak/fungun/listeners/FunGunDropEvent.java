package me.sanhak.fungun.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import me.sanhak.fungun.items.Items;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>FunGunDropEvent</b> class , It contains a little methods and functions that help the
 * plug-in to safe item from drop <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class FunGunDropEvent implements Listener { // Start

	//This simple method to disable/cancel the drop event
	@EventHandler
	public void DisableDrop(PlayerDropItemEvent e) {
		if (e.getItemDrop().getItemStack().equals(Items.FunGun())) {
			e.setCancelled(true);
		}
		if (e.getItemDrop().getItemStack().equals(Items.Reload())) {
			e.setCancelled(true);
		}
	}

} // End
