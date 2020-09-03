package recallPlugin.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import recallPlugin.RecallMain;

public class EnchantedGoldenApple {
	
	public void createEnchantedGoldenAppleRecipe() {
		ItemStack apple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
		NamespacedKey key = new NamespacedKey(RecallMain.getPlugin(RecallMain.class), "enchanted_golden_apple");
		ShapedRecipe recipe = new ShapedRecipe(key, apple);
		
		recipe.shape("GGG", "GAG", "GGG");
		recipe.setIngredient('G', Material.GOLD_BLOCK);
		recipe.setIngredient('A', Material.GOLDEN_APPLE);
		
		RecallMain.getPlugin(RecallMain.class).getServer().addRecipe(recipe);
	}

}
