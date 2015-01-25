package com.ColonelHedgehog.MenuAPI.Components;

import com.ColonelHedgehog.MenuAPI.System.MenuUtils;

/**
 * Created by ColonelHedgehog on 1/22/15.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class Coordinates
{
    private Menu menu;
    private int x;
    private int y;

    public Coordinates(Menu menu, int x, int y)
    {
        this.menu = menu;
        this.x = x;
        this.y = y;
    }

    public Coordinates(Menu menu, int slot)
    {
        this.menu = menu;
        this.x = MenuUtils.calculateXCoordinates(slot);
        this.y = MenuUtils.calculateYCoordinates(slot);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Menu getMenu()
    {
        return menu;
    }

    public int asSlotNumber()
    {
        return MenuUtils.toSlotNumber(this);
    }
}
