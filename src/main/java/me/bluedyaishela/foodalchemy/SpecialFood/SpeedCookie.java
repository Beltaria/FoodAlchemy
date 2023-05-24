package me.bluedyaishela.foodalchemy.SpecialFood;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedCookie implements Listener {

    @EventHandler
    public void onPlayerConsumeItem(PlayerItemConsumeEvent event)
    {
        Player player = event.getPlayer();

        player.sendMessage("Evènement fonctionnel");

        if (event.getItem().getType() != Material.COOKIE)
        {
            return;
        }

        player.sendMessage("Première condition passée");

        ItemMeta itemMeta = event.getItem().getItemMeta();
        if (!itemMeta.hasLore())
        {
            return;
        }

        player.sendMessage("Seconde condition passée");

        if (itemMeta.getLore().contains("Speed"))
        {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10 * 20, 1));
            player.sendMessage("Ajout de l'effet échoué");
        }
        else
        {
            player.sendMessage("N'est pas rentré dans la condition");
        }
    }
}
