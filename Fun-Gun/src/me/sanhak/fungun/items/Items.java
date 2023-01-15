package me.sanhak.fungun.items;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import me.sanhak.fungun.configuration.Configuration;
import me.sanhak.fungun.methods.Methods;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>Items</b> class , It contains a little methods and functions that help the
 * plug-in to handle items <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class Items { // Start

	// This method "addItems" allow player to get fun gun when join , die , etc
	public static void addItems(Player p) {
		PlayerInventory pi = p.getInventory();
		pi.setItem(Configuration.getConfig().getInt("Fun-Gun.Join-Slot"), FunGun());
	}

	// What you see here ?
	// i see a simple method to fungun item maybe
	// Yeah . good kid :) xd
	public static ItemStack FunGun() {
		ItemStack item = new ItemStack(Material.BLAZE_ROD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f(Configuration.getConfig().getString("Fun-Gun.Name")));
		if (Configuration.getConfig().getBoolean("Fun-Gun.Enable-Lore")) {
			List<String> lores = Configuration.getConfig().getStringList("Fun-Gun.Lores");
			for (int x = 0; x < lores.size(); x++) {
				lores.set(x, Methods.f(lores.get(x)));
			}
			meta.setLore(lores);
		}
		item.setItemMeta(meta);
		return item;
	}

	// What you see here ?
	// i see a simple method to Reload item maybe
	// Yeah . good kid :) xd (Ctrl+V)
	public static ItemStack Reload() {
		ItemStack item = new ItemStack(Material.FIREWORK_CHARGE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Methods.f("&7&lRelaoding.."));
		item.setItemMeta(meta);
		return item;
	}

} // End
