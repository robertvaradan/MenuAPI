package com.ColonelHedgehog.MenuAPI.Components;

import com.ColonelHedgehog.MenuAPI.Core.MenuAPI;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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

    public MenuObject(ItemStack holder)
    {
        if(holder == null)
        {
            throw new IllegalArgumentException(MenuAPI.ANSI_RED + MenuAPI.ANSI_BOLD_ON + "The ItemStack used as a menu object was null." + MenuAPI.ANSI_BOLD_OFF + MenuAPI.ANSI_RESET);
        }

        this.name = (holder.hasItemMeta() && holder.getItemMeta().hasDisplayName() ? holder.getItemMeta().getDisplayName() : "(Unnamed Menu Object)");
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
        return new ItemStack(icon, amount, data);
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
}
