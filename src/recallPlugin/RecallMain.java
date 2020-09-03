package recallPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import recallPlugin.listeners.RecallListener;
import recallPlugin.recipes.ElytraCraft;
import recallPlugin.recipes.EnchantedGoldenApple;
import recallPlugin.recipes.RecallPotion;

public class RecallMain extends JavaPlugin {
	
	private RecallMain instance;
	
	@Override
	public void onEnable() {
		instance = this;
		RecallPotion potion = new RecallPotion();
		ElytraCraft elytra = new ElytraCraft();
		EnchantedGoldenApple goldenApple = new EnchantedGoldenApple();
		
		potion.createRecallPotion();
		elytra.createElytraRecipe();
		goldenApple.createEnchantedGoldenAppleRecipe();
		
		getServer().getPluginManager().registerEvents(new RecallListener(), this);
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public RecallMain getInstance() {
		return this.instance;
	}

}
