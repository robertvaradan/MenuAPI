package com.ColonelHedgehog.MenuAPI.Components;

import com.ColonelHedgehog.MenuAPI.Core.MenuAPI;
import org.bukkit.inventory.Inventory;

/**
 * Created by ColonelHedgehog on 12/12/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class Menu
{
    Inventory i;

    public Menu(Inventory inv)
    {
        MenuAPI.getMenuRegistry().register(this);
    }
}
