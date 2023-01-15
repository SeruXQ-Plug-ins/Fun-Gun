package me.sanhak.fungun.methods;

import org.bukkit.ChatColor;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>Methods</b> class , It contains a little methods and functions that help
 * the plug-in <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class Methods { // Start

	// This a simple method return "value" after translate the color codes !
	public static String f(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}

} // End
