# Setup

To start with, there are a few basics we need to cover. 

First, make sure to download the latest stable version of MenuAPI from <a href="http://dev.bukkit.org/bukkit-plugins/menuapi">its BukkitDev page,</a> or clone and compile the source from here on GitHub (beware, stability isn't guaranteed).

Next, add MenuAPI to your build path. This should be easy for you, since you do this the same way you add the Bukkit API to your build path.

Now that it's set up, make a new project (Maven if you'd like, but totally optional: look at <a href="https://github.com/KingKrazy/MenuAPI/edit/master/README.md">the README file</a> to learn how to add it as a Maven dependency). Create your plugin.yml as you normally would. Except, this time add a new line called "depend", and add "[MenuAPI]" as its value. Example:

```
name: MenuTest
main: com.ColonelHedgehog.MenuTest.Core.Main
version: 1.0
author: ColonelHedgehog
depend: [MenuAPI]
```

Remember, if you have any other dependencies, you'll need to add those to the list. Example: if you need WorldEdit and Vault as well, you'd put:

```
depend: [WorldEdit, Vault, MenuAPI]
```

Note: if you don't have MenuAPI on your server, an error will be thrown in your console and your plugin won't start. To specify your own message, put the following in your onEnable method:

```
        if(getServer().getPluginManager().getPlugin("MenuAPI") == null)
        {
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "ERROR: Couldn't find nescessary dependency: " + ChatColor.RESET + "" + ChatColor.BLUE + "MenuAPI");
            setEnabled(false);
            return;
        }
```

... and do the same thing that I showed above for "depend," except put it in "softdepend" in your plugin.yml, following the same rules. Example:

```
name: MenuTest
main: com.ColonelHedgehog.MenuTest.Core.Main
version: 1.0
author: ColonelHedgehog
softdepend: [MenuAPI]
```

Remember to put the code at the very top of your onEnable() method.

Now you're ready to get to work!

## Related
<a href="https://github.com/KingKrazy/MenuAPI/edit/master/Tutorials/2 - Creating an Empty Menu.md">2 - Creating an Empty Menu</a>
