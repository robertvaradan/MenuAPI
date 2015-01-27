# Coordinates

## How coordinates work
Coordinates are very similar to Bukkit's Location class. You specify the <b>Menu, X, and Y</b> values.

### Menu
Think of the Menu like the World in a Location. Remember, when comparing Coordinates with different menu values, you might get an exception. <b>Never</b> create a new Menu just for coordinates!

Also see: <a href="https://github.com/KingKrazy/MenuAPI/tree/master/Documentation/Menu.md">Menu</a>.

### X
X is an <b>int</b> variable. This is <b>how many spaces from the top left to the top right</b> your object is at. Refer to the diagram below.

### Y
Same as X, except this is <b>how many spaces from the top left to the <u>bottom left</u></u> your object is at. Coupled with X, this forms a location. Refer to the diagram below.

### Diagram
This is an example of a 9 x 6 (54-slot) inventory. Like all inventories, <u>the X max is always constant.</u> The Y max may vary from size to size.

<img src="https://raw.githubusercontent.com/KingKrazy/MenuAPI/master/Documentation/Media/Coordinates%20Reference.png">
