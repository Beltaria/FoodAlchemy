package me.bluedyaishela.foodalchemy;

import me.bluedyaishela.foodalchemy.SpecialFood.SpeedCookie;
import org.bukkit.plugin.java.JavaPlugin;

public final class FoodAlchemy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadSpecialFood();
    }

    public void loadSpecialFood()
    {
        this.getServer().getPluginManager().registerEvents(new SpeedCookie(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
