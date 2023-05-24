package me.bluedyaishela.foodalchemy;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack boucheeAstrale;

    public static void init()
    {
        createBoucheeAstrale();
    }

    private static void createBoucheeAstrale()
    {
        ItemStack apple = new ItemStack(Material.APPLE);
        ItemMeta itemMeta = apple.getItemMeta();

        itemMeta.setDisplayName("§dBouchée Astrale");

        List<String> lore = new ArrayList<>();
        lore.add("§r» §e+5 coeurs d'Absorption");
        lore.add("§r» §c+5 coeurs");
        lore.add("");
        lore.add("§r» Durée : §e3 §rminutes");
        itemMeta.setLore(lore);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        apple.addUnsafeEnchantment(Enchantment.DURABILITY, 0);
        apple.setItemMeta(itemMeta);

        boucheeAstrale = apple;
    }
}
