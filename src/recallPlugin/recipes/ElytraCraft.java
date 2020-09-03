package recallPlugin.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import recallPlugin.RecallMain;

public class ElytraCraft {
	
	public void createElytraRecipe() {
		ItemStack elytra = new ItemStack(Material.ELYTRA, 1);
		
		NamespacedKey key = new NamespacedKey(RecallMain.getPlugin(RecallMain.class), "elytra");
		ShapedRecipe recipe = new ShapedRecipe(key, elytra);
		
		recipe.shape("DSD", "PNP", "FEF");
		recipe.setIngredient('D', Material.DIAMOND);
		recipe.setIngredient('P', Material.PHANTOM_MEMBRANE);
		recipe.setIngredient('N', Material.NETHERITE_INGOT);
		recipe.setIngredient('F', Material.FIRE_CHARGE);
		recipe.setIngredient('E', Material.ENDER_PEARL);
		recipe.setIngredient('S', Material.POTION);
		
		RecallMain.getPlugin(RecallMain.class).getServer().addRecipe(recipe);
	}

}
