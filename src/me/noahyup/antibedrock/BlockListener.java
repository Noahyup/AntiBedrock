package me.noahyup.antibedrock;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener{
	
	public BlockListener(Antibedrock plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e){
		
		Player player = e.getPlayer();
			if (!player.hasPermission("antibedrock.allow")) {
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You cannot place " + e.getBlock().getType().toString() + " down !");
				e.setCancelled(true);
			}
			else player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "You can place " + e.getBlock().getType().toString() + " down !");
	}

}
