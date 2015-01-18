package me.noahyup.antibedrock;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Antibedrock extends JavaPlugin {

	public Permission playerPermission = new Permission("antibedrock.allow");
	
	@Override
	public void onEnable() {
		new BlockListener(this);
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(playerPermission);
	}
	
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		if (cmd.getName().equalsIgnoreCase("antibedrock") && sender instanceof Player) {
		 Player player = (Player) sender;
		 
		 if(player.hasPermission("antibedrock.allow")){
		}
		return true;
	}
	return false;
}
}