package co.kepler.fastcraftplus.compat;

import co.kepler.fastcraftplus.recipes.FastRecipe;

import java.util.Set;

/**
 * Recipe compatibility class for FastCraft+.
 */
public class Compat_FastCraftPlus extends Compat {

    @Override
    public boolean init() {
        return true;
    }

    @Override
    public String getPluginName() {
        return null;
    }

    @Override
    public Set<FastRecipe> getRecipes() {
        return null;
    }
}