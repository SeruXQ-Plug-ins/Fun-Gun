package me.sanhak.fungun.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import me.sanhak.fungun.items.Items;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>Join_RespawnEvents</b> class , It contains a little methods and functions
 * that help the plug-in to add items to player after death and when join ! <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class Join_RespawnEvents implements Listener { // Start

	// This a simple method to add items to player when join
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Items.addItems(e.getPlayer());
	}

	// This a simple method to add items to player when respawn
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		Player p = e.getPlayer();
		Items.addItems(p);
	}

} // End
