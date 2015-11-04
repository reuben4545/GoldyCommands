package me.silentbloodgaming.goldycommands.commands;

import java.util.logging.Logger;
import me.silentbloodgaming.goldycommands.core.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_staffcommands
  implements CommandExecutor
{
  public Main plugin;
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args3)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("staffcommands")) {
      if (!(p instanceof Player))
      {
        this.plugin.logger.info("[GoldyCommands] Only players can use that command.");
      }
      else
      {
			p.sendMessage("§8§l[§6§lGoldyCommands§8§l] §4§l§n Command 1) /gtfo - Bans the player and rollbacks them.");
			p.sendMessage("§8§l[§6§lGoldyCommands§8§l] §4§l§n Command 2) /smite - Smites them and De-Ops them, use /opall after smiting someone.");
			p.sendMessage("§8§l[§6§lGoldyCommands§8§l] §4§l§n Command 3) /opall - Op's everyone on the server.");
			p.sendMessage("§8§l[§6§lGoldyCommands§8§l] §4§l§n Command 4) /deopall - Admin abuse day only, De-op's everyone on the server");
			p.sendMessage("§8§l[§6§lGoldyCommands§8§l] §4§l§n Command 5) /glist unban (and all it's other commands) -  Unban's the stated player, or ban's them for whatever is stated.");
            p.sendMessage("");
            p.sendMessage("");
            p.sendMessage("");
			p.sendMessage("§8§l[§6§lGoldyCommands§8§l] §4§l§n This was the first command ever made in the GoldyCommands plugin!");
        
      }
    }
    return false;
  }
}
