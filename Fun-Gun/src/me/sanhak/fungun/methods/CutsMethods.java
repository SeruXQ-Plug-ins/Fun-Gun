package me.sanhak.fungun.methods;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import me.sanhak.fungun.commands.ReloadCMD;
import me.sanhak.fungun.listeners.ClickEvent;
import me.sanhak.fungun.listeners.DamageEvent;
import me.sanhak.fungun.listeners.FunGunDropEvent;
import me.sanhak.fungun.listeners.InteractEvent;
import me.sanhak.fungun.listeners.Join_RespawnEvents;
import me.sanhak.fungun.main.Main;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>CutsMethods</b> class , It contains abbreviations for some things so that
 * you do not repeat them and complicate things for you <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class CutsMethods { // Start

	// This Method to register events !
	public static void RegisterEvents() {
		PluginManager pm = Bukkit.getPluginManager(); // Get Plug-in Manager

		pm.registerEvents(new Join_RespawnEvents(), Main.getMain());
		pm.registerEvents(new InteractEvent(), Main.getMain());
		pm.registerEvents(new FunGunDropEvent(), Main.getMain());
		pm.registerEvents(new DamageEvent(), Main.getMain());
		pm.registerEvents(new ClickEvent(), Main.getMain());

	}

	// This Method to register the commands !
	public static void RegisterCommands() {
		Main m = Main.getMain();
		m.getCommand("reloadconfig").setExecutor(new ReloadCMD());
	}

	// This method send messages when plug-in enabled or disabled ! / Print Messages
	// according to plug-in status
	public static void PrintPluginStatusMessages(int Status) {
		if (Status == 1) { // If the input == 1 (Enabled the plugin) ==> will send message like down
			Bukkit.getConsoleSender().sendMessage(Methods.f("&b\n    ______               ______               \r\n"
					+ "   / ____/_  ______     / ____/_  ______      \r\n"
					+ "  / /_  / / / / __ \\   / / __/ / / / __ \\     \r\n"
					+ " / __/ / /_/ / / / /  / /_/ / /_/ / / / /     \r\n"
					+ "/_/    \\__,_/_/ /_/   \\____/\\__,_/_/ /_/      \r\n"
					+ "                                  By [SeruXQ Development Team] discord.gg/tM9rJuAzUE"));
			Bukkit.getConsoleSender().sendMessage(Methods.f("&6FunGun &aPlugin has been Enabled"));
		} else if (Status == 0) { // If the input == 0 (Disabled the plugin) ==> will send message like down
			Bukkit.getConsoleSender().sendMessage(Methods.f("&c\n    ______               ______               \r\n"
					+ "   / ____/_  ______     / ____/_  ______      \r\n"
					+ "  / /_  / / / / __ \\   / / __/ / / / __ \\     \r\n"
					+ " / __/ / /_/ / / / /  / /_/ / /_/ / / / /     \r\n"
					+ "/_/    \\__,_/_/ /_/   \\____/\\__,_/_/ /_/      \r\n"
					+ "                                  By [SeruXQ Development Team] discord.gg/tM9rJuAzUE"));
			Bukkit.getConsoleSender().sendMessage(Methods.f("&6FunGun &cPlugin has been Disabled"));
		} else { // If input not equal 1 or 0 ==> Error
			Logger.Error("Wrong input please input 0 or 1 | 1 to enable | 0 to disable");
			Logger.Error("Thank you for using my plugin <3");
		}
	} //

} // End