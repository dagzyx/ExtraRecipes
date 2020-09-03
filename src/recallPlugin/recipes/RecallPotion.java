package recallPlugin.recipes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import recallPlugin.RecallMain;

public class RecallPotion {
	
	public void createRecallPotion() {
		ItemStack potion = new ItemStack(Material.POTION, 1);
		ItemMeta potionMeta = potion.getItemMeta();
		
		potionMeta.setDisplayName(ChatColor.AQUA + "Recall Potion");
		potionMeta.addEnchant(Enchantment.DURABILITY, (int) 1, true);
		potionMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		potion.setItemMeta(potionMeta);
		
		NamespacedKey key = new NamespacedKey(RecallMain.getPlugin(RecallMain.class), "recall_potion");
		ShapedRecipe recipe = new ShapedRecipe(key, potion);
		
		recipe.shape(" D ", "EWE", " D ");
		recipe.setIngredient('D', Material.DIAMOND);
		recipe.setIngredient('E', Material.ENDER_PEARL);
		recipe.setIngredient('W', Material.POTION);
		
		RecallMain.getPlugin(RecallMain.class).getServer().addRecipe(recipe);
		
	}

}
