package com.ColonelHedgehog.Menus.Core;

import com.ColonelHedgehog.Menus.Libraries.MenuRegistry;
import com.ColonelHedgehog.Menus.Listeners.MenuActions;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/* NOTE: The following applies to all content within this entire Jar.
 * These files are FREE and licensed under the GPL. If using my code,
 * please recognize:
 * - All files herein are under no warranty.
 * - You may not attempt to make money off of my work.
 * - If using over 60 lines of my code, please provide visible credit.
 */

public class MenuAPI extends JavaPlugin
{
    private static MenuRegistry menuRegistry;
    private static MenuAPI plugin;

    @Override
    public void onEnable()
    {
        plugin = this;
        menuRegistry = new MenuRegistry();
        plugin.getServer().getPluginManager().registerEvents(new MenuActions(), this);
        Bukkit.getConsoleSender().sendMessage("Initializing " + ChatColor.BLUE + ChatColor.BOLD + "Colonel" + ChatColor.DARK_AQUA + "Hedgehog" + ChatColor.RESET + "'s " + ChatColor.YELLOW + "MenuAPI. All libraries loaded." + ChatColor.RESET);
    }

    @Override
    public void onDisable()
    {

    }

    public MenuRegistry getMenuRegistry()
    {
        return menuRegistry;
    }


    public static MenuAPI i()
    {
        return plugin;
    }
}