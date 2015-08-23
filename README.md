<a href="https://github.com/ColonelHedgehog/MenuAPI/wiki">Wiki</a> • <a href="http://dev.bukkit.org/bukkit-plugins/menuapi">BukkitDev</a> • <a href="http://colonelhedgehog.com">Website</a> • <a href="https://github.com/ColonelHedgehog/MenuAPI/issues">Issues</a>

# MenuAPI
MenuAPI is an API that excells at conciseness, ease of use, and flexibility. As a developer, I got sick and tired of having to create separate listeners in separate classes for doing the simplest of things. Inventory menus took a long time because of the sheer amount of calculations and code that were needed. Now you can make a sleek, professional inventory menu in minutes using this powerful core.

# MenuAPI is a whole plugin. Is it cumbersome?

Not at all. MenuAPI takes up about 20kbs of space. And if you have just two plugins using it on your server, its size would be half of what it would be if it was installed built in to each plugin!

# Is it simple to install as a developer?
MenuAPI uses Maven to make things easier for you. If you're making a Maven project, you can add the repository like this:

```XML
	<repositories>
	        <repository>
	            <id>MenuAPI-repo</id>
	            <url>https://github.com/ColonelHedgehog/MenuAPI/raw/master/</url>
	        </repository>
	</repositories>
```
Then, to depend on the project, just add this:
```XML
	<dependencies>
	        <dependency>
	            <groupId>com.ColonelHedgehog</groupId>
	            <artifactId>MenuAPI</artifactId>
	            <version>1.2-SNAPSHOT</version>
	        </dependency>
	</dependencies>
```

<b>Please note:</b> This cannot be used as a substitute to <code>depend: [MenuAPI]</code> in your plugin.yml. This is project-based <u>only</u>.

# How do I use this thing?
Fear not! I've covered all of the basics of this API <a href="https://github.com/ColonelHedgehog/MenuAPI/wiki/1.-Setup">here.</a> <b>Don't forget, you can help me by forking this repo and submitting pull requests for your tutorials, too!</b>
