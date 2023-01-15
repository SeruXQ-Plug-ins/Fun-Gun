package me.sanhak.fungun.main;

import org.bukkit.plugin.java.JavaPlugin;

import me.sanhak.fungun.configuration.Configuration;
import me.sanhak.fungun.methods.CutsMethods;
import me.sanhak.fungun.methods.Methods;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>Main</b> class , It the Main Class of Project (init) From here everything
 * starts / Main class (init) / soul of project <br>
 * <br>
 * Class was created in <b>0.1 version</b> by Sanhak
 */

public class Main extends JavaPlugin { // Start

	public static Main m; // Get object of The Main class
	public Configuration config; // Get object of The Configuration class
	public static String Prefix = Methods.f("&8︳ &6Fun-Gun &8︳ &r"); // Plugin Prefix

	// When the plug-in Start or enable !
	@Override
	public void onEnable() {
		m = this; // Definition of Main object
		config = new Configuration("config.yml", this, true); // Definition of Main object
		CutsMethods.RegisterEvents(); // Register the events
		CutsMethods.RegisterCommands(); // Register the commands !
		CutsMethods.PrintPluginStatusMessages(1); // Print Messages according to
													// plug-in status
	}

	// When the plug-in stop or disable !
	@Override
	public void onDisable() {
		CutsMethods.PrintPluginStatusMessages(0); // Print Messages according to
													// plug-in status
	}

	// Get the Main Folder Path / or get instance of main class / get Main
	// Main class
	public static Main getMain() {
		return m;
	}

} // End
