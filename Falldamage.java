package me.comp.Falldamge;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Falldamage extends JavaPlugin {
	public class FalldamageEntitylistener {

	}

	public static Falldamage plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	   public void onDisable() {
			  PluginDescriptionFile pdffile = this.getDescription();
			  this.logger.info(pdffile.getName() + "is now disabled.");
		   }
	   
	   public void onEnable() {
			  PluginDescriptionFile pdffile = this.getDescription();
			  this.logger.info(pdffile.getName() + "is now enabled.");
			  getConfig().options().copyDefaults(true);
			  this.saveDefaultConfig();
		   }
}
