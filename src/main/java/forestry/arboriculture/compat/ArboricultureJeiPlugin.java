package forestry.arboriculture.compat;

import com.google.common.base.Preconditions;
import forestry.arboriculture.PluginArboriculture;
import forestry.arboriculture.items.ItemRegistryArboriculture;
import forestry.core.utils.JeiUtil;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;

@JEIPlugin
public class ArboricultureJeiPlugin implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		ItemRegistryArboriculture items = PluginArboriculture.getItems();
		Preconditions.checkNotNull(items);

		JeiUtil.addDescription(registry,
				items.grafter,
				items.grafterProven
		);
	}
}
