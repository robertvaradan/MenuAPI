package com.ColonelHedgehog.MenuAPI.Listeners;

import com.ColonelHedgehog.MenuAPI.Components.Menu;
import com.ColonelHedgehog.MenuAPI.Components.MenuObject;
import com.ColonelHedgehog.MenuAPI.Core.MenuAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by ColonelHedgehog on 12/11/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class MenuActions implements Listener
{
    @EventHandler
    public void onClick(InventoryClickEvent event)
    {
        if(event.getCurrentItem() == null)
        {
            return;
        }

        Menu menu = MenuAPI.i().getMenuRegistry().getByInventory(event.getInventory());
        if(menu == null)
        {
            return;
        }

        event.setCancelled(true);

        MenuObject menuObject = menu.getItemByItemStack(event.getCurrentItem());

        if(menuObject == null)
        {
            return;
        }


        if(menuObject.getActionListener() == null)
        {
            return;
        }

        menuObject.getActionListener().onClick(event.getClick(), menuObject, (Player) event.getWhoClicked());
    }
}
