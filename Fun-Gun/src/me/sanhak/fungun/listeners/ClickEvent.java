package me.sanhak.fungun.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>ClickEvent</b> class , It contains a little methods and functions that help the
 * plug-in to safe item <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

import me.sanhak.fungun.items.Items;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>ClickEvent</b> class , It contains a little methods and functions that
 * help the plug-in to safe item from clicks and cancel the click event <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class ClickEvent implements Listener { // Start

	// This method to disable move the items when click on and safe it
	@EventHandler
	public void WhenClickonFunGun(InventoryClickEvent e) {
		if (e.getCurrentItem() == null) return;
		if (e.getCurrentItem().equals(Items.FunGun())) {
			e.setCancelled(true);
		}
		if (e.getCurrentItem().equals(Items.Reload())) {
			e.setCancelled(true);
		}
	}

	// This method to disable move the items when click on and safe it
	@EventHandler
	public void WhenClickonFunGun(InventoryCreativeEvent e) {
		if (e.getCurrentItem() == null) return;
		if (e.getCurrentItem().equals(Items.FunGun())) {
			e.setCancelled(true);
			e.getWhoClicked().setGameMode(GameMode.ADVENTURE);
		}
		if (e.getCurrentItem().equals(Items.Reload())) {
			e.setCancelled(true);
			e.getWhoClicked().setGameMode(GameMode.ADVENTURE);
		}
	}

} // End
