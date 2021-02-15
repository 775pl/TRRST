package fr.selma.terromc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class Inventaire implements CommandExecutor {
	
	Inventory inv = Bukkit.createInventory(null, InventoryType.CHEST, "§8Inventaire");

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		Player player = (Player)sender;
		
			if(args.length == 0) {
				if(inv != null ) {

					player.openInventory(inv);
				
				}

			}
			return false;
		}
	}
