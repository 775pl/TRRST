package fr.selma.terromc;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import fr.selma.terromc.commands.Alerte;
import fr.selma.terromc.commands.Inventaire;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public void onEnable() {
		System.out.println("Le plugin s'est bien allumé");
		getCommand("inventory").setExecutor(new Inventaire());
		getCommand("alerte").setExecutor(new Alerte()); //puis la arte
	}
	
	
	@Override
	public void onDisable() {
		System.out.println("Le plugin vient de s'éteindre");
	}
}