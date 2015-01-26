package com.ColonelHedgehog.Menus.System;

import com.ColonelHedgehog.Menus.Components.Coordinates;

/**
 * Created by ColonelHedgehog on 12/11/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class MenuUtils
{
    public static int calculateXCoordinates(int slot)
    {
        return (slot + 2 - calculateYCoordinates(slot));
    }

    public static int calculateYCoordinates(int slot)
    {
        return (slot / 9) + 1;
    }

    public static int toSlotNumber(Coordinates coordinates)
    {
        return ((coordinates.getY() - 1) * 9) + (coordinates.getX() - 1);
    }
}
