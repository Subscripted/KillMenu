package dev.subscripted.inventoryframework.commands;

import dev.subscripted.inventoryframework.Framework;
import dev.subscripted.inventoryframework.inventorys.menus.KillPlayerMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player p = (Player) sender;

            //create the menu and then open it for the player
            new KillPlayerMenu(Framework.getPlayerMenuUtility(p)).open();

        }

        return true;
    }

}

