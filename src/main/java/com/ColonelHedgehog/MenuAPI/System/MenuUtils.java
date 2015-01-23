package com.ColonelHedgehog.MenuAPI.System;

import com.ColonelHedgehog.MenuAPI.Components.MenuObject;
import com.ColonelHedgehog.MenuAPI.Core.MenuAPI;

/**
 * Created by ColonelHedgehog on 12/11/14.
 * You have freedom to modify given sources. Please credit me as original author.
 * Keep in mind that this is not for sale.
 */
public class MenuUtils
{
    public static MenuObject getMenuObjectAtCoordinated(int X, int Y)
    {
        if(X > 8 || Y > 8 || X < 0 || Y < 0)
        {
            throw new IllegalArgumentException(MenuAPI.ANSI_BOLD_ON + MenuAPI.ANSI_RED + "Unreachable coordinates: \"(" + X + ", " + Y + ")\"! Values must be greater than -1 but smaller than 9.");
        }

        return null;
    }
}
