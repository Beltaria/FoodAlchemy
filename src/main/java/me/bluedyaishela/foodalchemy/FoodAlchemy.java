package me.bluedyaishela.foodalchemy;

import me.bluedyaishela.foodalchemy.Commands.Operator.OperatorCommands;
import me.bluedyaishela.foodalchemy.SpecialFood.SpeedCookie;
import org.bukkit.plugin.java.JavaPlugin;

public final class FoodAlchemy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadUtils();
        loadSpecialFood();
        useCommands();

        System.out.println("FoodAlchemy a démarré avec succès.");
    }

    public void loadSpecialFood()
    {
        this.getServer().getPluginManager().registerEvents(new SpeedCookie(), this);
    }

    public void loadUtils()
    {
        ItemManager.init();
    }

    public void useCommands()
    {
        this.getCommand("foodalchemy").setExecutor(new OperatorCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
