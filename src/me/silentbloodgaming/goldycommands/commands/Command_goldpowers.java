package me.silentbloodgaming.goldycommands.commands;

import me.silentbloodgaming.goldycommands.core.Main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_goldpowers implements CommandExecutor {
	
	public Main plugin;
	
   @Override
	public boolean onCommand(CommandSender sender, Command cmd, String s,String[] args) {
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("goldpowers")){
				  plugin.logger.info("§8§l[§6§lGoldyCommands§8§l] §4§l§nOnly players may use this command.");
			  }else{
			p.chat("I will kill my victim........");
			p.chat("My victim is............... botisz02.......");
			p.chat("I will kill you with my gold-powers..........");
			p.chat("It is over now.....");
			p.chat("DIE!!!!!!!!!!!!!!!");
			p.chat("/smite botisz02");
			p.chat("/sys del botisz02");
			p.chat("get rekt m9");
		    p.chat("Git gud botisz02....................................................");
			p.chat("/gtfo botisz02 This was just for fun! Admin abuse day it is btw so ill unban you kek??????");
			p.chat("/glist unban botisz02");
			
			
				  
				  
		}

		
		return false;
	}

   }
		
