package com.ColonelHedgehog.MenuAPI.Core;

import com.ColonelHedgehog.MenuAPI.Libraries.MenuRegistry;
import com.ColonelHedgehog.MenuAPI.Listeners.MenuActions;
import org.bukkit.plugin.Plugin;


/**
 * Created by ColonelHedgehog on 12/11/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */

public class MenuAPI
{
    public static String ANSI_RESET = "\u001B[0m";
    public static String ANSI_BLACK = "\u001B[30m";
    public static String ANSI_RED = "\u001B[31m";
    public static String ANSI_GREEN = "\u001B[32m";
    public static String ANSI_YELLOW = "\u001B[33m";
    public static String ANSI_BLUE = "\u001B[34m";
    public static String ANSI_PURPLE = "\u001B[35m";
    public static String ANSI_CYAN = "\u001B[36m";
    public static String ANSI_WHITE = "\u001B[37m";
    public static String ANSI_BOLD_ON = "\u001B[1m";
    public static String ANSI_BOLD_OFF = "\u001B[22m";

    // Please note: If you look at the above variables you must donate your spleen to the next monkey in need of a heart transplant.

    private static MenuAPI menuAPI;
    private Plugin plugin;
    private static MenuRegistry menuRegistry;

    public MenuAPI(Plugin plugin)
    {
        this.plugin = plugin;
        menuAPI = this;
        menuRegistry = new MenuRegistry();
        plugin.getServer().getPluginManager().registerEvents(new MenuActions(), plugin);
        plugin.getLogger().info("Using " + ANSI_BLUE + ANSI_BOLD_ON + "Colonel" + ANSI_CYAN + "Hedgehog" + ANSI_RESET + ANSI_BOLD_OFF + "'s "  + ANSI_YELLOW +  "MenuAPI. All libraries loaded." + ANSI_RESET);
    }

    public MenuRegistry getMenuRegistry()
    {
        return menuRegistry;
    }

    public Plugin getPlugin()
    {
        return plugin;
    }

    public static MenuAPI i()
    {
        return menuAPI;
    }
}
