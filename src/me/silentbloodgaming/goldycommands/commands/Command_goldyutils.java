package me.silentbloodgaming.goldycommands.commands;

import me.silentbloodgaming.goldycommands.core.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_goldyutils implements CommandExecutor {
	
	public Main plugin;
	
   @Override
	public boolean onCommand(CommandSender sender, Command cmd, String s,String[] args) {
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("goldyutils")){
			  if(!(p instanceof Player)){
				  plugin.logger.info("§8§l[§6§lGoldyCommands§8§l] §4§l§nOnly players may use this command.");
			  }else{
			p.chat("/tag set &8&l[&9&lServer Host&8&l]");
		    p.chat("/settabname &8&l[&9&lServer Host&8&l] &b&kLP&1&l&nG&2&l&no&3&l&nl&4&l&nl&4&l&nd&6y&b&kLP");
		    p.chat("Utils fixed (tabname & tag etc)");
		    p.sendMessage("Utils tabname tag etc fixed.");
		}
		}
		
		return false;
	}

   }
		
