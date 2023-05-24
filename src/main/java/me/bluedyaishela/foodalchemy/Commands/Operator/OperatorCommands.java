package me.bluedyaishela.foodalchemy.Commands.Operator;

import me.bluedyaishela.foodalchemy.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OperatorCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player))
        {
            return false;
        }

        Player player = (Player)sender;

        if (args.length == 0)
        {
            player.sendMessage("Vous utilisez actuellement FoodAlchemy, pour voir les commandes faites /foodalchemy help");
        }

        if (args.length == 1)
        {
            String argument = args[0];
            if (argument.equals("boucheeAstrale"))
            {
                player.getInventory().addItem(ItemManager.boucheeAstrale);
                player.sendMessage("Vous avez obtenue une Bouchée Astrale !");
            }
        }

        return false;
    }
}
