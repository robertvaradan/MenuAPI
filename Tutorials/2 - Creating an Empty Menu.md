# Creating an Empty Menu
Once you've <a href="https://github.com/KingKrazy/MenuAPI/blob/master/Tutorials/1%20-%20Setup.md">set up MenuAPI</a>, you're going to want to get to work. This tutorial is oging to teach you how to make the canvas for your inventory menu. My explanation is going to be pretty short, and will just teach you how to use the Menu object. If you want to learn how to add items and deal with coordinates, refer to the bottom.

First, let's find a place to create our Menu. Here's an idea:

```
    public void onRightClickEntity(PlayerInteractEvent event)
    {
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
        {
            if(event.getClickedBlock().getType() == Material.SIGN || event.getClickedBlock().getType() == Material.WALL_SIGN)
            {
                Sign sign = (Sign) event.getClickedBlock().getState();
                if(sign.getLine(0).equalsIgnoreCase("[Butcher]"))
                {
                    // ...
                }
            }
        }
    }
```

Basically, its just going to do what we want it to do if we right-click a sign that has a first line equalling "[Butcher]".

Now, I cut it off at <code>// ...</code> just for referrence. At this point, we'll need to go through the steps of creating our Inventory.

First, use the Bukkit#createInventory() method to create a new Inventory:

```
Inventory inventory = Bukkit.createInventory(player, size, name);
```

#### player:
Type: Player<br>
The owner of the inventory. In this case, it should be <code>event.getPlayer();</code>

#### size:
Type: int<br>
This is the size of the inventory in slots. <b>This must always be evenly divisible by 9.</b> To test this, just get a calculator, put your desired number of slots in and divide it by 9. If you get a decimal number, <b>you cannot use it.</b>

Recommended inventory sizes are: <b>9, 18, 27, 36, 45, 54</b> WARNING: Anything above 54 will be glitchy, whether or not it's divisible by 9. For big inventories, 54 is the safest to use.

### name:
Type: String<br>
This can be up to 32 characters long. Anything longer will throw an error into the console and your inventory will not work. You can use colors here, but some won't show up very well (namely §7 and §e). For general purposes, it's best to use their dark alternatives (the ChatColors whose names start with "DARK").

Now that we've made the inventory, we'll need to create it as a menu. Something you should note is the Menu will be registered from the moment it is initialized. When you use the Menu#close() method, however, it will de-register.

To create it, simply use the following method: 

```
Menu menu = new Menu(inventory);
```

You can do lots of things from here. But those are for different tutorials. To open your tutorial, just do this:

```
menu.openFor(player);
```

Close it using:

```
menu.close();
```

Remember, an Inventory menu should <b>never</b> be stored in a variable outside of the method. Read on at the related link below to learn how to populate your inventory.

# Related
<a href="https://github.com/KingKrazy/MenuAPI/blob/master/Tutorials/3 - Adding MenuObjects to Your Inventory">3 - Adding MenuObjects to Your Inventory</a>
