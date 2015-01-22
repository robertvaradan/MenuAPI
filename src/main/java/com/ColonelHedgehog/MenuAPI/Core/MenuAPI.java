package com.ColonelHedgehog.MenuAPI.Core;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by ColonelHedgehog on 1/21/15.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class MenuAPI extends JavaPlugin
{
    private static MenuAPI menuAPI;

    public static MenuAPI i()
    {
        return menuAPI;
    }
    
    @EventHandler
    public void onEnable()
    {

    }
}
