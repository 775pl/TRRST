package fr.selma.terromc;

import org.bukkit.event.Listener;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class PlayerSpawn implements Listener{
	
	@EventHandler
	public void joueurQuiRejoint(PlayerJoinEvent e) {
		
		Player player = e.getPlayer();
		player.getInventory().clear();
		
		ItemStack bombe = new ItemStack(Material.TNT, 1);
		ItemMeta modifBombe = bombe.getItemMeta();

		modifBombe.setDisplayName("§cUne bonne grosse bombe");
		modifBombe.setLore(Arrays.asList("§dJe détruis tous les mécréants sur mon chemin"));
		modifBombe.addEnchant(Enchantment.DAMAGE_ALL, 200, true);
		modifBombe.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		bombe.setItemMeta(modifBombe);
		
		player.getInventory().setItemInMainHand(bombe);
		
		ItemStack torche = new ItemStack(Material.REDSTONE_TORCH, 1);
		ItemMeta modifTorche = torche.getItemMeta();

		modifTorche.setDisplayName("§cUne bonne grosse torche");
		modifTorche.setLore(Arrays.asList("§dٱللَّٰهُ أَكْبَرُ"));
		torche.setItemMeta(modifTorche);

		player.getInventory().setItemInOffHand(torche);
		

		player.updateInventory();

	}


}
