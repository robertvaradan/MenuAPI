package com.ColonelHedgehog.Menus.Components;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ColonelHedgehog on 12/11/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class MenuObject
{
    private String name;
    private List<String> tooltip;
    private Material icon;
    private short data;
    private int amount;
    private Coordinates coordinates;
    private ActionListener actionListener;
    private Menu menu;

    public void setIcon(ItemStack holder)
    {
        this.name = (holder.hasItemMeta() && holder.getItemMeta().hasDisplayName() ? holder.getItemMeta().getDisplayName() : null);
        this.tooltip = (holder.hasItemMeta() && holder.getItemMeta().hasLore() ? holder.getItemMeta().getLore() : new ArrayList<String>());
        this.icon = holder.getType();
        this.data = holder.getDurability();
        this.amount = holder.getAmount();

        update();
    }

    public void setIcon(Material icon, byte data, String name, List<String> tooltip)
    {
        this.name = name;
        this.tooltip = tooltip;
        this.data = data;
        this.icon = icon;
        this.amount = 1;

        update();
    }

    public MenuObject(ItemStack holder)
    {
        if(holder == null)
        {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "The ItemStack used as a menu object was null." + ChatColor.RESET);
            throw new IllegalArgumentException();
        }

        this.name = (holder.hasItemMeta() && holder.getItemMeta().hasDisplayName() ? holder.getItemMeta().getDisplayName() : "");
        this.tooltip = (holder.hasItemMeta() && holder.getItemMeta().hasLore() ? holder.getItemMeta().getLore() : new ArrayList<String>());
        this.icon = holder.getType();
        this.data = holder.getDurability();
        this.amount = holder.getAmount();
        this.coordinates = null;
        this.actionListener = null;
        this.menu = null;
    }

    public MenuObject(Material icon, byte data, String name, List<String> tooltip)
    {
        this.name = name;
        this.tooltip = tooltip;
        this.data = data;
        this.icon = icon;
        this.amount = 1;
        this.coordinates = null;
        this.actionListener = null;
        this.menu = null;
    }

    public ItemStack toItemStack()
    {
        ItemStack stack = new ItemStack(icon, amount, data);
        ItemMeta meta = stack.getItemMeta();
        meta.setLore(tooltip);
        if(name != null)
        {
            meta.setDisplayName(name);
        }
        stack.setItemMeta(meta);
        return stack;
    }

    public Coordinates getCoordinates()
    {
        return coordinates;
    }
    public void setCoordinates(Coordinates coordinates)
    {
        this.coordinates = coordinates;
    }

    public void setActionListener(ActionListener actionListener)
    {
        this.actionListener = actionListener;
    }

    public ActionListener getActionListener()
    {
        return actionListener;
    }

    public void update()
    {
        coordinates.getMenu().getInventory().setItem(coordinates.asSlotNumber(), toItemStack());
    }
}
