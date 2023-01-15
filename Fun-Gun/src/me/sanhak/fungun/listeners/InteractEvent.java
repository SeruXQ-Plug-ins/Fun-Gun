package me.sanhak.fungun.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.scheduler.BukkitTask;
import me.sanhak.fungun.configuration.Configuration;
import me.sanhak.fungun.items.Items;
import me.sanhak.fungun.main.Main;
import me.sanhak.fungun.methods.BarAPI;
import me.sanhak.fungun.methods.Methods;

/**
 * [<b>SeruXQ Development Team</b>] <br>
 * <br>
 * <b>InteractEvent</b> class , It contains a little methods and functions that
 * help the plug-in , it contains on a interact event and Projectile Hit Event
 * and cool down system <br>
 * <br>
 * Class was created in <b>0.3 version</b> by Sanhak
 */

public class InteractEvent implements Listener {

	private BukkitTask t;
	private int count;

	// Projectile Hit Event
	@EventHandler
	public void onProjectileHitEvent(ProjectileHitEvent e) {
		if (e.getEntity() instanceof Snowball) {
			Location ball = e.getEntity().getLocation();

			World world = e.getEntity().getWorld();
			for (int x = 0; x < 6; ++x) {
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
				world.playEffect(e.getEntity().getLocation(), Effect.LAVA_POP, 10);
			}

			world.playEffect(e.getEntity().getLocation(), Effect.HEART, 10);
			world.playSound(ball, Sound.CAT_MEOW, 7.0F, 7.0F);

			ball.getWorld().playSound(ball, Sound.CAT_MEOW, 1221.0F, 12221.0F);

		}
	}

	// When player use the fungun
	@EventHandler
	public void onUseFunGun(PlayerInteractEvent e) {
		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
				&& e.getPlayer().getItemInHand().equals(Items.FunGun())) {
			e.getPlayer().launchProjectile(Snowball.class);
			// It's make you jumpppppppppppppppppppppp
//			Vector v = e.getPlayer().getLocation().getDirection().multiply(4.5D).setY(2.0D);
//			e.getPlayer().setVelocity(v);
			e.getPlayer().getInventory().remove(Items.FunGun());
			PlayerInventory pi = e.getPlayer().getInventory();
			pi.setItem(Configuration.getConfig().getInt("Fun-Gun.Join-Slot"), Items.Reload());
			Start(e.getPlayer());
		}
	}

	// Sanhak fkra wl fkra la tmot bitches (br br br)!
	public void Start(Player p) {
		count = Configuration.getConfig().getInt("Fun-Gun.Cool-Down") + 1;
		t = Bukkit.getScheduler().runTaskTimer(Main.getMain(), () -> {
			if (count == 1) {
				p.getInventory().remove(Items.Reload());
				PlayerInventory pi = p.getInventory();
				pi.setItem(Main.getMain().getConfig().getInt("Fun-Gun.Join-Slot"), Items.FunGun());
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 15.0f, 15.0f);
				t.cancel();
			}
			count--;
			BarAPI.send(p, Methods.f("&fPlease wait &a" + count + " &fs to use &6&lFUN-GUN &fagain !"));
			p.playSound(p.getLocation(), Sound.CLICK, 15.0f, 15.0f);
		}, 20, 20);
	}

} // End
