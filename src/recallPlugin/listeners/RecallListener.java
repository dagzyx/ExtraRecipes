package recallPlugin.listeners;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

public class RecallListener implements Listener {
	
	@EventHandler
	public void onConsume(PlayerItemConsumeEvent event) {
		ItemStack potion = event.getItem();
		if(event.getItem().getType().equals(Material.POTION)) {
			if(event.getItem().getItemMeta().hasItemFlag(ItemFlag.HIDE_ENCHANTS)) {
				Player player = (Player) event.getPlayer();
				
				if(!(player.getBedSpawnLocation() == null)) {
					player.teleport(player.getBedSpawnLocation());
					player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_CHIME, 1f, 1f);
					player.getInventory().removeItem(potion);
				}
				else {
					event.setCancelled(true);
				}
			}
			
			
		}
	}

}
