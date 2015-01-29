package com.ColonelHedgehog.Menus.System;

import com.ColonelHedgehog.Menus.Components.Coordinates;

/**
 * Created by ColonelHedgehog on 12/11/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class MenuUtils
{
    public static int[] calculateCoordinates(int slot)
    {
        slot++;
        int sloty = (slot / 9);
        int slotx = slot - (sloty * 9);

        return new int[]{slotx, sloty + 1};
    }

    public static int toSlotNumber(Coordinates coordinates)
    {
        return ((coordinates.getY() - 1) * 9) + (coordinates.getX() - 1);
    }
}
