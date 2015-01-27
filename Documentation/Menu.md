# Menu

## How to use Menus

Read: <a href="https://github.com/KingKrazy/MenuAPI/blob/master/Tutorials/2%20-%20Creating%20an%20Empty%20Menu.md">Creating an Empty Menu</a>

## Reference

### Initializers

#### Type A

Menu(Inventory inv)

<b>inv:</b> The Inventory you're using as a menu.

## Methods

#### getInventory();
<b>Return type:</b> Inventory<br>
<b>Modifiers:</b> public<br>

Returns the Inventory assigned to the Menu object.

#### setInventory(Inventory inv);
<b>Return type:</b> void<br>
<b>Modifiers:</b> public<br>

<b>inv:</b> The Inventory to replace the exiting inventory with.

Replaces the existing Inventory associated with the Menu object.

#### getItemAt(<a href="https://github.com/KingKrazy/MenuAPI/blob/master/Documentation/Coordinates.md">Coordinates</a> coordinates);
<b>Return type:</b> <a href="https://github.com/KingKrazy/MenuAPI/blob/master/Documentation/MenuObject.md">MenuObject</a><br>
<b>Modifiers:</b> public<br>

<b>coordinates:</b> The coordinates on the Menu to get the MenuObject from.

#### setMenuObjectAt(Coordinates coordinates, MenuObject, menuObject);
<b>Return type:</b> void<br>
<b>Modifiers:</b> public<br>

<b>coordinates:</b> Where to place the MenuObject.<br>
<b>menuObject:</b> The MenuObject to place at the coordinates.

Places (or replaces) a MenuObject at a location.

#### removeMenuObjectAt(Coordinates coordinates);
<b>Return type:</b> void<br>
<b>Modifiers:</b> public<br>

<b>coordinates:</b> Where to remove the MenuObject from.<br>

Removes all MenuObject data from a specific location (unless no MenuObject is present).

#### addMenuObject(MenuObject... menuObject);
<b>Return type:</b> void<br>
<b>Modifiers:</b> public<br>

<b>menuObject:</b> The MenuObject(s) to place in the Menu. Can be several, seperated by commas.

Places MenuObject(s) at the first available spot in the Menu.

#### @Deprecated: close();

<b>Return type:</b> void<br>
<b>Modifiers:</b> @Deprecated, public<br>

Closes and deregisters the Menu and deletes all data from it.

#### close(Player p);

<b>Return type:</b> void<br>
<b>Modifiers:</b> public<br>

<b>p:</b> The Player to close the Inventory for.

Closes the Menu's Inventory for a specific Player. If nobody is viewing the Inventory, it is deregistered and deleted.

#### getObjects();

<b>Return type:</b> HashMap<Integer, MenuObject><br>
<b>Modifiers:</b> public<br>

Gets a HashMap with each slot and its respective MenuObject.
