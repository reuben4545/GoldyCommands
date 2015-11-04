package me.silentbloodgaming.goldycommands.core;

import java.util.logging.Logger;

import me.silentbloodgaming.goldycommands.commands.Command_goldpowers;
import me.silentbloodgaming.goldycommands.commands.Command_goldyutils;
import me.silentbloodgaming.goldycommands.commands.Command_staffcommands;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public Main plugin;
	
	@Override
	public void onEnable(){
		PluginDescriptionFile pdffile = this.getDescription();
		logger.info("GoldyCommands made by reuben4545 has been Enabled!");
		logger.info("Enabling Command_staffcommands.java & Command_goldpowers.java");
		getCommand("staffcommands").setExecutor(new Command_staffcommands());
		getCommand("goldpowers").setExecutor(new Command_goldpowers());
		getCommand("goldyutils").setExecutor(new Command_goldyutils());
	}
	
	@Override
	public void onDisable(){
		PluginDescriptionFile pdffile = this.getDescription();
		logger.info("GoldyCommands made by reuben4545 has been Disabled!");
		logger.info("Disabling Command_staffcommands.java & Command_goldpowers.java");
	}
}
